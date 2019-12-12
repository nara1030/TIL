간단한 웹 서버
=====
자바 웹 서버 동작 원리 설명
- - -
## 목차
1. [개요](#개요)
2. [요약](#요약)
	* [HTTP](#HTTP)
		* [HTTP 요청](#HTTP-요청)
		* [HTTP 응답](#HTTP-응답)
	* Socket 클래스
	* ServerSocket 클래스
	* 애플리케이션
		* HttpServer 클래스
		* Request 클래스
		* Response 클래스
		* 실행하기
3. [참고](#참고)

## 개요
웹 서버는 클라이언트(주로 웹 브라우저)와 통신할 때 HTTP(Hypertext Transfer Protocol)를 사용하기 때문에 HTTP 서버라고도 한다. 자바 기반의 웹 서버는 2개의 중요한 클래스 `java.net.Socket`과 `java.net.ServerSocket`을 사용하며, HTTP를 통해 통신을 수행한다.

##### [목차로 이동](#목차)

## 요약
먼저 HTTP와 2개의 클래스를 살펴본 후 단순한 버전의 웹 서버 애플리케이션을 설명한다.

##### [목차로 이동](#목차)

### HTTP
Hypertext Transfer Protocol, 즉 HTTP는 인터넷에서 웹 서버와 브라우저가 데이터를 주고받는 데 필요한 프로토콜이다. 또 HTTP는 요청/응답 방식의 프로토콜이다. HTTP는 신뢰성 높은 TCP 연결을 사용하며, TCP 포트 80번을 기본으로 사용한다.

HTTP의 첫번째 버전은 HTTP/0.9였으며, 그 후 HTTP/1.0으로 대체됐다. 현재의 버전 HTTP 1.1은 RFC(Request for Comments) 2616에서 정의하고 있다(이는 책 집필 당시의 버전이고 [현재](https://developer.mozilla.org/ko/docs/Web/HTTP/Basics_of_HTTP/Evolution_of_HTTP)는 HTTP 2 버전이다).

HTTP에서는 항상 클라이언트가 연결을 맺고 HTTP 요청을 송신함으로써 트랜잭션이 시작된다. 즉 웹서버는 스스로 클라이언트에 접속하지 않으며, 클라이언트로의 응답 연결을 시도하지도 않는다. 서버나 클라이언트는 통신이 완료되기 전에 연결을 종료할 수 있다. 예를 들어 파일 다운로드가 진행되고 있는 브라우저에서 중지 버튼을 누르면 사실상 웹 서버와의 HTTP 연결은 끊어진다.

##### [목차로 이동](#목차)

#### HTTP 요청
HTTP 요청(HTTP Request)은 다음 세 가지 요소로 구성된다.

* 메소드 - URI(Uniform Resource Identifier) - 프로토콜/버전
* 요청 헤더(Request headers)
* 문서 본체(Entity body)

##### [목차로 이동](#목차)

#### HTTP 응답
HTTP 요청과 마찬가지로 HTTP 응답 역시 세 가지 요소로 구성된다.

* 프로토콜 - 상태 코드(Status code) - 설명(Description)
* 응답 헤더(Response headers)
* 문서 본체(Entity body)

##### [목차로 이동](#목차)

## 참고


##### [목차로 이동](#목차)
