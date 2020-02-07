package com.eom.openapi.service;

import com.eom.openapi.repository.response.BlogResponse;
import com.eom.openapi.repository.response.BlogResponseList;
import com.eom.openapi.repository.response.MovieResponse;
import com.eom.openapi.repository.response.MovieResponseList;
import com.eom.openapi.util.httpConfig.UriBuilder;
import com.eom.openapi.util.searchConfig.Category;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {
    private final RestTemplate restTemplate;
    private final HttpHeaders httpHeaders;
    private final String uri;

    private String searchUri;

    // 생성자 주입: @Resource 미사용?
    private SearchService(RestTemplate restTemplate, HttpHeaders httpHeaders, String uri) {
        this.restTemplate = restTemplate;
        this.httpHeaders = httpHeaders;
        this.uri = uri;
    }

    public List<BlogResponse> searchBlog(String query) {
        UriBuilder uriBuilder = new UriBuilder(uri);
        searchUri = uriBuilder.createUrl(Category.BLOG.getCategory(), query);
        // exchange 메소드: header 정보 추가 가능(cf. getForObject 메소드)
        // stream 사용 위해 리턴 타입 변경(LIMIT 제한)
        List<BlogResponse> blogResponses = restTemplate.exchange(searchUri, HttpMethod.GET, new HttpEntity<>(httpHeaders), BlogResponseList.class).getBody().getItems();
        return blogResponses.stream().limit(3).collect(Collectors.toList());
    }

    public List<MovieResponse> searchMovie(String query) {
        UriBuilder uriBuilder = new UriBuilder(uri);
        searchUri = uriBuilder.createUrl(Category.MOVIE.getCategory(), query);
        List<MovieResponse> movieResponses = restTemplate.exchange(searchUri, HttpMethod.GET, new HttpEntity<>(httpHeaders), MovieResponseList.class).getBody().getItems();
        return movieResponses.stream().limit(3).collect(Collectors.toList());
    }
}
