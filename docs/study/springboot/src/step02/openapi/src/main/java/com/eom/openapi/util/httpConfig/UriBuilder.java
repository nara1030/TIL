package com.eom.openapi.util.httpConfig;

import org.springframework.web.util.UriComponentsBuilder;

import java.nio.charset.Charset;

public class UriBuilder {
    private final String uri;

    // 생성자 주입(service 사용 위해 public 제한)
    public UriBuilder(String uri) {
        this.uri = uri;
    }

    public String createUrl(String category, String query) {
        // UriComponentsBuilder의 메서드 체이닝 방식: 가독성 향상
        return UriComponentsBuilder.newInstance()
                .scheme("https")    // URI 분리
                .host(uri)
                //.port(8083)       // properties 설정
                .path(category)     // 변환 고민
                .queryParam("query", query)
                .build()
                .encode(Charset.forName("UTF-8"))
                .toUri().toString();
    }
}
