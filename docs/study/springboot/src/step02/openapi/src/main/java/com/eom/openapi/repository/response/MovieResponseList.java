package com.eom.openapi.repository.response;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
public class MovieResponseList {
    private Date lastBuildDate;     // 검색 결과 생성 시간
    private List<MovieResponse> items;   // 개별 검색 결과

    public MovieResponseList() {
        items = new ArrayList<>(10);
    }
}
