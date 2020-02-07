package com.eom.openapi.repository.response;

import lombok.Getter;

import java.util.Date;

@Getter
public class MovieResponse {
    private String title;   // 영화 제목(검색어와 일치하는 부분 태그 표시)
    private String image;   // 이미지 URL(없는 경우 null)
    private Date pubDate;   // 제작년도
    private String director;    // 감독
    private String actor;   // 배우
    private String userRating; // 관람객 평점: Type Integer 에러
}
