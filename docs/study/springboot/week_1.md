1주차 - AutoConfiguration, Embedded Tomcat
=====
* 일시: 2020.01.03(금), 11:30 ~ 13:30
* 장소: 삼성역 스터디룸
- - -
## 목차
1. [참고](#참고)
2. [진행](#진행)

## 참고
* 1주차
	* [발표 자료](https://docs.google.com/presentation/d/1Eb05e4tT8LqZ_szpuk69-pjwjGXHIqtCORVVo2KxYiM/edit#slide=id.p)
	* [실습 코드](https://github.com/sieunkr/spring-study-friday)
	* 강의 자료
		* [스프링부트 AutoConfiguration에 대해 샘플코드로 이해하기](https://brunch.co.kr/@springboot/199)
		* [스프링부트 Profile 설정](https://dhsim86.github.io/web/2017/03/28/spring_boot_profile-post.html)
		* [스프링부트 환경에서 Tomcat 설정 및 성능 검토하기](https://brunch.co.kr/@springboot/98)

##### [목차로 이동](#목차)

## 진행
불참한 관계로 차주 진행을 위해 준비사항을 적는다.

* 인텔리제이 설치
	* Ultimate 버전이 좋으나 Community도 무방
	* ~~스프링부트 환경에서 `hello world` 띄워보기~~(Community 버전에서도 해볼 것)
* 네이버 API에서 오픈 API 사용 권한 받기
	* [API 공통 가이드](https://developers.naver.com/docs/common/openapiguide/appregister.md)
	* [API 검색 > 블로그](https://developers.naver.com/docs/search/blog/)
* ~~깃 계정 생성(∵ 코드 리뷰)~~([참고](https://github.com/next-step/nextstep-docs/tree/master/codereview)) 
* [과제](https://github.com/nara1030/openapi/tree/master): STEP01 참고
	* [예시답안](https://github.com/sieunkr/spring-study-friday/tree/master/day01)
	* ~~Embedded Tomcat Port, Max Thread 설정 변경해보기~~
		* [스프링부트 내장 서버 설정](https://www.daleseo.com/spring-boot-embedded-server-config/) 
		* [Spring Boot - Limit on number of connections created](https://stackoverflow.com/questions/39002090/spring-boot-limit-on-number-of-connections-created)

- - -
추후 수정 및 삭제.

* 스프링 부트 기초: Packing시 War 파일 사용하지 않고 내장된 Embedded Tomcat 또는 Jetty 사용 가능
	* [인텔리제이에서 스프링부트 프로젝트 설정하기](https://madplay.github.io/post/create-springboot-project-in-intellij)
	* [인텔리제이로 자바 프로젝트 만들기](https://alwayspr.tistory.com/18)
	* [인텔리제이로 스프링부트 시작하기](https://softarchitecture.tistory.com/62)
	* [스프링부트 War로 배포하기](https://4urdev.tistory.com/84)
		* [스프링부트 War/Jar 생성시 질문](https://okky.kr/article/516604)
	* [스프링부트 관련 팁](https://jojoldu.tistory.com/43)
	* AutoConfiguration
		* [스프링캠프 2016 이수홍님 발표자료](https://github.com/sbcoba/spring-camp-2016-spring-boot-autoconfiguration)
		* [스프링부트 AutoConfiguration 개발](https://luvstudy.tistory.com/69)

##### [목차로 이동](#목차)