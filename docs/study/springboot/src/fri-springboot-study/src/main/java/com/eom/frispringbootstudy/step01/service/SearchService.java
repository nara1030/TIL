package com.eom.frispringbootstudy.step01.service;

import com.eom.frispringbootstudy.step01.repository.response.BlogResponseList;
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
    // 접근제한자: default → service package 한정?
    SearchService(RestTemplate restTemplate, HttpHeaders httpHeaders, String searchUrl) {
        this.restTemplate = restTemplate;
        this.httpHeaders = httpHeaders;
        this.searchUrl = searchUrl;
    }

    public ResponseEntity<BlogResponseList> search(String query) {
        searchUrl = searchUrl + query;
        // exchange 메소드: header 정보 추가 가능
        return restTemplate.exchange(searchUrl, HttpMethod.GET, new HttpEntity<>(httpHeaders), BlogResponseList.class);
    }
}
