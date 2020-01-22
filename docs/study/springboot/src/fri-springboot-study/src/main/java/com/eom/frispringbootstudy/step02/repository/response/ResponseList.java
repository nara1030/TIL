package com.eom.frispringbootstudy.step02.repository.response;

import com.eom.frispringbootstudy.step01.repository.response.BlogResponse;
import lombok.Getter;

import java.util.Date;

@Getter
public class ResponseList {
    private Date lastBuildDate;     // 검색 결과 생성 시간
    private com.eom.frispringbootstudy.step01.repository.response.BlogResponse[] items;   // 개별 검색 결과

    public ResponseList() {
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
