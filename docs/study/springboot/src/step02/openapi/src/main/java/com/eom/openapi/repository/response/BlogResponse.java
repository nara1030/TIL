package com.eom.openapi.repository.response;

import lombok.Getter;

@Getter
public class BlogResponse {
    private String title;   // 문서 제목(검색 결과 일치 태그 표시)
    private String bloggername; // 블로거명
    private String description; // 문서 요약(검색 결과 일치 태그 표시)
    private String link;    // 문서 링크
}
