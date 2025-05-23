2주차 - 스프링부트 DI
=====
* 일시: 2020.01.10(금), 11:30 ~ 13:30
* 장소: 삼성역 스터디룸
* [발표자료](https://docs.google.com/presentation/d/1Eb05e4tT8LqZ_szpuk69-pjwjGXHIqtCORVVo2KxYiM/edit#slide=id.p)
* [요구사항](https://github.com/spring-basic-study/openapi)
- - -
## 목차
1. [참고](#참고)
	* [인텔리제이 단축키](#인텔리제이-단축키)
	* [스프링 부트 임포트 및 실행방법](#스프링-부트-임포트-및-실행방법)
2. [Todo](#Todo)
	* [구현](#구현)
	* [배경](#배경)
3. [기타](#기타)

## 참고
* [발표 자료](https://docs.google.com/presentation/d/1Eb05e4tT8LqZ_szpuk69-pjwjGXHIqtCORVVo2KxYiM/edit#slide=id.p)

##### [목차로 이동](#목차)

### 인텔리제이 단축키
* 오버라이딩: ctrl + o
* 주석: ctrl + /
* .

##### [목차로 이동](#목차)

### 스프링 부트 임포트 및 실행방법
* [Spring Boot 프로젝트 임포트 및 실행방법](https://gist.github.com/sungkwangsong/3717edde69390238e3de836e8364ccdb)

##### [목차로 이동](#목차)

## Todo
- [ ] STEP01 에서 진행한 블로그 연동과 유사하게, 영화 Open API 를 연동해서 간단한 검색을 제공한다.
- [ ] 하나의 쿼리 요청에, 블로그 + 영화 정보를 함께 제공하는 API 를 만든다(Response 스펙은 자유롭게...).
- [ ] 블로그, 영화 OpenAPI 구현시 사용한 RestTemplate 호출 구문의 중복을 최소화 해보자.
- [ ] RestTemplate 의 쓰레드풀, TimeOut 등의 설정을 변경해보자.
- [ ] 블로그, 또는 영화 정보 조회 시 LIMIT 로 개수를 제한해본다.
	- (Open API 호출할때가 아니라) Open API 에서 가져온 데이터를 제한해서 제공

##### [목차로 이동](#목차)

### 구현
스프링 부트를 처음 접해보기도 하고 지식이 많지 않아 들은 내용들이 파편화되어 있는데 우선 기억나는 부분들을 기록한다(틀린 부분 있을 수 있음). 추후 수정 및 삭제.

* Spring Boot → JAR → 설정 정보 맞춰줄 필요 없음
	* Config 서버 따로 쓸 때 장단
	* JAR/WAR → Active Profile?: [이건가?](https://heowc.tistory.com/38)
* Http Client
	* [Spring Cloud Openfeign: 개요](https://brunch.co.kr/@springboot/202)
	* RestTemplate
		* [Spring RestTemplate Tutorial - appsdeveloperblog](http://www.appsdeveloperblog.com/spring-resttemplate-tutorial/)
		* [RestTemplate - 1](https://sjh836.tistory.com/141)
		* [RestTemplate - 2](https://hoonmaro.tistory.com/46)
		* [Spring RestTemplate](https://vnthf.github.io/blog/Java-RestTemplate%EC%97%90-%EA%B4%80%ED%95%98%EC%97%AC/)
	* Feign
		* [Microservices Communication: Feign as REST Client](https://dzone.com/articles/microservices-communication-feign-as-rest-client)
		* [우아한 feign 적용기](http://woowabros.github.io/experience/2019/05/29/feign.html)
* 기타
	* @Bean 로직은 @ComponentScan 실행 시 단 한번만 실행
	* Lombok 사용 시 @DATA 비권장(대신 SETTER/GETTER 사용)
	* @Autowired 비권장
	* 과제 관련 응답타입 제한은 없지만 JSON 형식?
	
##### [목차로 이동](#목차)

### 배경


##### [목차로 이동](#목차)

## 기타
추후 확인 후 삭제.

* HTTP 통신
	* [Java 11: Standardized HTTP Client API - DZone](https://dzone.com/articles/java-11-standardized-http-client-api)
	* [A Simple HTTP Server in Java - DZone](https://dzone.com/articles/simple-http-server-in-java)
	* [Lightweight Embedded Java REST Server Without a Framework - DZone](https://dzone.com/articles/lightweight-embedded-java-rest-server-without-a-fr)
* 기타
	* API 호출 예제
		* [Java로 API 호출 모듈 작성](http://blog.naver.com/occidere/221241789173)
		* [네이버 오픈 API 사용하기](https://blog.naver.com/rnjsrldnd123/221496605706)
		* [URLConnection & HttpURLConnection](https://goddaehee.tistory.com/161)
	* Socket 통신
		* [JAVA 네트워크 프로그래밍](https://cornswrold.tistory.com/67)
		* [JAVA 소켓 프로그래밍](https://gangzzang.tistory.com/entry/Java-%EC%86%8C%EC%BC%93-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D)

##### [목차로 이동](#목차)