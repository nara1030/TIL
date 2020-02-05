package com.eom.frispringbootstudy.step01.repository.response;

import lombok.Getter;

import java.util.Date;

@Getter
public class BlogResponseList {
    private Date lastBuildDate;     // 검색 결과 생성 시간
    private BlogResponse[] items;   // 개별 검색 결과

    public BlogResponseList() {
        // TODO: 파싱 중 JSON → LIST 에러
        // 5개를 주면 item이 5개 나올 줄 알았는데 아니네?
        items = new BlogResponse[5];
    }

//    public Date getLastBuildDate() {
//        return lastBuildDate;
//    }
//
//    public BlogResponse[] getItems() {
//        return items;
//    }
}
