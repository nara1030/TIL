package com.eom.frispringbootstudy.step01.service;

import com.eom.frispringbootstudy.step01.model.response.BlogResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchService {
    private RestTemplate restTemplate;
    private HttpHeaders httpHeaders;
    private String searchUrl;

    // 생성자 주입: @Resource 미사용?
    // 접근제한자: default
    SearchService(RestTemplate restTemplate, HttpHeaders httpHeaders, String searchUrl) {
        this.restTemplate = restTemplate;
        this.httpHeaders = httpHeaders;
        this.searchUrl = searchUrl;
    }

    public ResponseEntity<BlogResponse> search(String query) {
        searchUrl = searchUrl + query;
        return restTemplate.exchange(searchUrl, HttpMethod.GET, new HttpEntity<>(httpHeaders), BlogResponse.class);
    }
}
