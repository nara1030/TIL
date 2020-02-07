3주차 - 스프링부트 MVC, REST API
=====
* 일시: 2020.01.17(금), 11:30 ~ 13:30
* 장소: 삼성역 스터디룸
* [발표자료](https://docs.google.com/presentation/d/1Eb05e4tT8LqZ_szpuk69-pjwjGXHIqtCORVVo2KxYiM/edit#slide=id.p)
* [요구사항](https://github.com/spring-basic-study/openapi)
- - -
## 목차
1. [참고](#참고)
2. [Todo](#Todo)
	* [구현](#구현)
	* [배경](#배경)
3. [기타](#기타)

## 참고
* [발표 자료](https://docs.google.com/presentation/d/1Eb05e4tT8LqZ_szpuk69-pjwjGXHIqtCORVVo2KxYiM/edit#slide=id.p)

##### [목차로 이동](#목차)

## Todo

- 필수 요구사항(필수 요구사항을 구현하면 PR 보내도 됨)
 - [ ] 영화 데이터 조회 시 디폴트로 평점 높은 순으로 정렬(Sort)해서 제공한다.
 - [ ] 영화 데이터 조회 시 디폴트로 평점이 0.0 인 경우는 제외하고 제공한다.
 - [ ] 네이버 오픈 API 인증 실패 시 Exception(예외처리)를 구현한다.(@RestControllAdvice, @ExceptionHandler 어노테이션을 활용해본다.)    
- 선택 요구사항(시간 여유 있으신 분들만 해주세요)
 - [ ] 통합검색 API에서 블로그, 영화 조회 시 순차호출 방식이 아닌 병렬 프로그래밍으로 동시에 호출해서 데이터를 조합한다.
 - [ ] DTO를 정의해서 데이터를 매핑한다. (예) 네이버 블로그 OpenAPI 에 조회하는 응답 Response Type 클래스가 Blog 라고 가정하면, 신규 클래스인 BlogDTO 클래스를 정의하고, 네이버 OpenAPI 를 통해서 가져온 데이터를 BlogDTO 에 매핑해서 사용한다.

##### [목차로 이동](#목차)

## 기타


##### [목차로 이동](#목차)
