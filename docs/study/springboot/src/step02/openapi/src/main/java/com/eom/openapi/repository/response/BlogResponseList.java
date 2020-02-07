package com.eom.openapi.repository.response;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
public class BlogResponseList {
    private Date lastBuildDate;     // 검색 결과 생성 시간
    private List<BlogResponse> items;   // 개별 검색 결과

    public BlogResponseList() {
        // TODO: 파싱 중 JSON → LIST 에러
        items = new ArrayList<BlogResponse>(10);
    }
}
