1주차 - AutoConfiguration, Embedded Tomcat
=====
* 일시: 2020.01.03(금), 11:30 ~ 13:30
* 장소: 삼성역 스터디룸
- - -
## 목차
1. [참고](#참고)
2. [진행](#진행)
3. [개인공부](#개인공부)
	* [실습](#실습)
	* [이론](#이론)
		* [Spring MVC vs Spring Boot](#Spring-MVC-vs-Spring-Boot)
		* [API vs Library](#API-vs-Library)

## 참고
* [발표 자료](https://docs.google.com/presentation/d/1Eb05e4tT8LqZ_szpuk69-pjwjGXHIqtCORVVo2KxYiM/edit#slide=id.p)
* 실습
	* [요구사항: STEP01](https://github.com/spring-basic-study/openapi)
* 기타
	* [스프링부트 AutoConfiguration에 대해 샘플코드로 이해하기](https://brunch.co.kr/@springboot/199)
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

### 실습
간단한 `Hello World!` 출력 웹애플리케이션을 띄워본 후 오픈 API 호출하는 부분을 추가해본다(STEP01).	

1. `Hello World!` 출력: [소스코드 링크](https://github.com/nara1030/TIL/blob/master/docs/study/springboot/src/week_1/src/main/java/study/springboot/week_1/Hello.java)
2. version1: [소스코드 링크](https://github.com/nara1030/TIL/tree/master/docs/study/springboot/src/week_1/src/main/java/study/springboot/week_1/version1)
	* 1_블로그 정보 조회(깔끔하게 응답 변경 필요)
	* 7_API 호출 시 RestTemplate 사용(별도의 Bean으로 정리 무슨 말?)
3. version2: [소스코드 링크](https://github.com/nara1030/TIL/tree/master/docs/study/springboot/src/week_1/src/main/java/study/springboot/week_1/version2)
	* 2_설정 정보 application 파일에 설정: [`application.properties`](https://github.com/nara1030/TIL/blob/master/docs/study/springboot/src/week_1/src/main/resources/application.properties)
	* 3_어노테이션을 사용해 설정 정보 가져오기
		* JavaConfig 파일(@ConfigurationProperties): [`RestConfig.java`](https://github.com/nara1030/TIL/blob/master/docs/study/springboot/src/week_1/src/main/java/study/springboot/week_1/version2/RestConfig.java)
		* Bean 설정(@EnableConfigurationProperties): [`BeanRegister.java`](https://github.com/nara1030/TIL/blob/master/docs/study/springboot/src/week_1/src/main/java/study/springboot/week_1/version2/BeanResister.java)
	* 5_톰캣 설정 변경: [`application.properties`](https://github.com/nara1030/TIL/blob/master/docs/study/springboot/src/week_1/src/main/resources/application.properties)
4. .

- - -
**STEP01**

1. 네이버 오픈API 를 연동해서, query(파라미터)로 검색어를 전달해서 블로그 정보를 조회한다.
	* https://developers.naver.com/docs/search/blog/
	* https://developers.naver.com/docs/common/openapiguide/apilist.md#%EA%B2%80%EC%83%89
2. ~~OpenAPI 연동 URL,인증키 등 정보를 application 파일에 설정~~
3. application파일에 정의한 정보를 @ConfigurationProperties, @EnableConfigurationProperties 어노테이션을 사용해서 가져오기 
4. "local" profile 로 애플리케이션 실행
5. ~~Embedded Tomcat Port, Max Thread 설정(`확인 어디서?`) 변경해보기~~
6. Service or Repository 패키지 레이어로 분리해보기
7. Open API 호출 시 RestTemplate를 사용하며, 별도의 Bean 으로 정의한다.(@Configuration, @Bean 사용)
8. Lombok 버전을 내가 원하는 버전으로 디펜던시 변경해보기

##### [목차로 이동](#목차)

### 이론

### Spring MVC vs Spring Boot
* [Spring Boot App의 간단한 빌드와 런](https://velog.io/@drypot/Spring-Boot-App-%EC%9D%98-%EA%B0%84%EB%8B%A8%ED%95%9C-%EB%B9%8C%EB%93%9C%EC%99%80-%EB%9F%B0-)
* [Spring Boot vs. Spring MVC vs. Spring: How Do They Compare?](https://dzone.com/articles/spring-boot-vs-spring-mvc-vs-spring-how-do-they-compare)
* AutoConfiguration
	* [스프링캠프 2016 이수홍님 발표자료](https://github.com/sbcoba/spring-camp-2016-spring-boot-autoconfiguration)
	* [스프링부트 AutoConfiguration 개발](https://luvstudy.tistory.com/69)

##### [목차로 이동](#목차)

### API vs Library
API는 명세.

##### [목차로 이동](#목차)
