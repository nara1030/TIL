2주차 - 스프링부트 DI
=====
* 일시: 2020.01.10(금), 11:30 ~ 13:30
* 장소: 삼성역 스터디룸
- - -
## 목차
1. [참고](#참고)
	* [인텔리제이 단축키](#인텔리제이-단축키)
2. [진행](#진행)
3. [개인공부](#개인공부)
	* [실습](#실습)
	* [이론](#이론)

## 참고
* [발표 자료](https://docs.google.com/presentation/d/1Eb05e4tT8LqZ_szpuk69-pjwjGXHIqtCORVVo2KxYiM/edit#slide=id.p)

##### [목차로 이동](#목차)

### 인텔리제이 단축키
* 오버라이딩: ctrl + o
* 주석: ctrl + /
* .

##### [목차로 이동](#목차)

## 진행
스프링 부트를 처음 접해보기도 하고 지식이 많지 않아 들은 내용들이 파편화되어 있는데 우선 기억나는 부분들을 기록한다(틀린 부분 있을 수 있음).

* Spring Boot → JAR → 설정 정보 맞춰줄 필요 없음
	* Config 서버 따로 쓸 때 장단
	* JAR/WAR → Active Profile?: [이건가?](https://heowc.tistory.com/38)
* Http Client
	* [Spring Cloud Openfeign: 개요](https://brunch.co.kr/@springboot/202)
	* [RestTemplate](https://hoonmaro.tistory.com/46)
	* [Microservices Communication: Feign as REST Client](https://dzone.com/articles/microservices-communication-feign-as-rest-client)
	* [우아한 feign 적용기](http://woowabros.github.io/experience/2019/05/29/feign.html)
* 기타
	* @Bean 로직은 @ComponentScan 실행 시 단 한번만 실행
	* Lombok 사용 시 @DATA 비권장(대신 SETTER/GETTER 사용)
	* @Autowired 비권장
	* 과제 관련 응답타입 제한은 없지만 JSON 형식?
	
##### [목차로 이동](#목차)

## 개인공부
대부분 IT 회사 업무엔 API 개발이 큰 비중을 차지하고 있다고 한다. 따라서 이번 스터디도 네이버 오픈 API를 활용하는 예를 통해 진행되는 것 같다.

##### [목차로 이동](#목차)

### 실습
저번 주에 이어 오픈 API를 호출하는 코드를 Spring Boot를 이용해서 구현해보도록 한다. 다만 추가로 HTTP 프로토콜에 대한 이해를 높이기 위해 Java만으로도 호출 코드를 만들어보기로 한다.

* .

- - -
**STEP02**

1. STEP01 에서 진행한 블로그 연동과 유사하게, 영화 Open API 를 연동해서 간단한 검색을 제공한다.
2. 하나의 쿼리 요청에, 블로그 + 영화 정보를 함께 제공하는 API 를 만든다(Response 스펙은 자유롭게...).
2. 블로그, 영화 OpenAPI 구현시 사용한 RestTemplate 호출 구문의 중복을 최소화 해보자.
3. RestTemplate 의 쓰레드풀, TimeOut 등의 설정을 변경해보자.
4. 블로그, 또는 영화 정보 조회 시 LIMIT 로 개수를 제한해본다.  
   (Open API 호출할때가 아니라) Open API 에서 가져온 데이터를 제한해서 제공

##### [목차로 이동](#목차)

### 이론
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