1주차 - AutoConfiguration, Embedded Tomcat
=====
* 일시: 2020.01.03(금), 11:30 ~ 13:30
* 장소: 삼성역 스터디룸
- - -
## 목차
1. [참고](#참고)
2. [진행](#진행)
3. [개인공부](#개인공부)
	* [Spring MVC vs Spring Boot](#Spring-MVC-vs-Spring-Boot)
	* [API vs Library](#API-vs-Library)

## 참고
* [발표 자료](https://docs.google.com/presentation/d/1Eb05e4tT8LqZ_szpuk69-pjwjGXHIqtCORVVo2KxYiM/edit#slide=id.p)
* 실습
	* [요구사항: STEP01](https://github.com/spring-basic-study/openapi)
	* [스프링부트 AutoConfiguration에 대해 샘플코드로 이해하기](https://brunch.co.kr/@springboot/199)
* 기타
	* [스프링부트 Profile 설정](https://dhsim86.github.io/web/2017/03/28/spring_boot_profile-post.html)
	* [스프링부트 환경에서 Tomcat 설정 및 성능 검토하기](https://brunch.co.kr/@springboot/98)
	* [스프링5 웹플럭스 정리 및 샘플코드](https://brunch.co.kr/@springboot/96)

##### [목차로 이동](#목차)

## 진행
불참한 관계로 차주 진행을 위해 준비사항을 적는다.

* ~~깃 계정 생성(∵ 코드 리뷰)~~([참고](https://github.com/next-step/nextstep-docs/blob/master/codereview/review-step1.md)) 
* 인텔리제이 설치 후 스프링부트 환경에서 `hello world` 띄워보기
	* ~~Ultimate 버전~~
	* Community 버전
* 네이버 API에서 오픈 API 사용 권한 받기 및 이용 방법
	* [API 공통 가이드](https://developers.naver.com/docs/common/openapiguide/README.md)
	* [API 검색 > 블로그](https://developers.naver.com/docs/search/blog/)

##### [목차로 이동](#목차)

## 개인공부
간단한 `Hello World!` 출력 웹애플리케이션을 띄워보면서 프레임워크간 차이([Spring MVC vs Spring Boot](#Spring-MVC-vs-Spring-Boot))를 확인할 필요가 있다. 또한 이에 오픈 API **호출**하는 부분을 추가해본다([API vs Library](#API-vs-Library)).	

##### [목차로 이동](#목차)

### Spring MVC vs Spring Boot
도입.

* [Spring Boot App의 간단한 빌드와 런](https://velog.io/@drypot/Spring-Boot-App-%EC%9D%98-%EA%B0%84%EB%8B%A8%ED%95%9C-%EB%B9%8C%EB%93%9C%EC%99%80-%EB%9F%B0-)

스프링. 스프링 MVC. 스프링부트.

* [Spring Boot vs. Spring MVC vs. Spring](http://blog.naver.com/PostView.nhn?blogId=sthwin&logNo=221271008423&redirect=Dlog&widgetTypeCall=true&directAccess=false)
* [Spring Boot vs. Spring MVC vs. Spring: How Do They Compare?](https://dzone.com/articles/spring-boot-vs-spring-mvc-vs-spring-how-do-they-compare)
* [스프링부트 관련 팁](https://jojoldu.tistory.com/43)

스프링부트 시작.

* [Spring Boot 개발환경 구성](https://yonguri.tistory.com/9)
* [인텔리제이에서 스프링부트 프로젝트 설정하기](https://madplay.github.io/post/create-springboot-project-in-intellij)
* [인텔리제이로 자바 프로젝트 만들기](https://alwayspr.tistory.com/18)
* [인텔리제이로 스프링부트 시작하기](https://softarchitecture.tistory.com/62)
* WAR? JAR?
	* [스프링부트 War로 배포하기](https://4urdev.tistory.com/84)

기타.

* AutoConfiguration
	* [스프링캠프 2016 이수홍님 발표자료](https://github.com/sbcoba/spring-camp-2016-spring-boot-autoconfiguration)
	* [스프링부트 AutoConfiguration 개발](https://luvstudy.tistory.com/69)

##### [목차로 이동](#목차)

### API vs Library
API는 명세.

##### [목차로 이동](#목차)
