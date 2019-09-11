오브젝트 10단원 예제 코드 작성해보기
=====
목적: 중복코드의 문제점 이해  
정보: 한 달에 한 번씩 가입자별로 전화 요금을 계산하는 애플리케이션  
버전: 1.0
- - -
## 목차
1. [로직](#로직)
2. [설계](#설계)
3. [기타](#기타)
	* [API](#API)

## 로직
> 전화요금 = 통화 시간 / 단위 시간당 요금

유지보수의 경우, 로직을 파악하기 위해서 실행 및 소비자 클래스를 먼저 이해하는 것이 좋다.

##### [목차로 이동](#목차)
	
## 설계
* 클래스 설계(객체 정보)
	* Call: 개별 통화 기간 저장
	* Phone: 통화 요금을 계산
		* 통화 요금: 전체 통화 목록, 요금제에 대해 알고 있음
		* 요금제: 단위요금, 단위시간을 알고 있음
	* Money: ?
		* 책에 구현부가 생략되어 있었는데, 작성이 어려워 저자의 코드를 찾아봤음
		* [저자의 구현](https://github.com/eternity-oop/object/blob/master/chapter10/src/main/java/org/eternity/money/Money.java)

##### [목차로 이동](#목차)
		
## 기타

### API
생소했지만 중요한 API에 대해 정리해본다(~~Duration 같은 클래스는 직접 작성해야 하는 줄 알고 오해했지만 그게 아니었다~~).

* LocalDateTime
	* [아직도 `Calendar`, `Date` 사용하니?](https://jeong-pro.tistory.com/163)
	* [자바8의 `java.time` 패키지](http://blog.eomdev.com/java/2016/04/01/%EC%9E%90%EB%B0%948%EC%9D%98-java.time-%ED%8C%A8%ED%82%A4%EC%A7%80.html)
* BigDecimal
	* [`BigDecimal` 사용법 정리](https://jsonobject.tistory.com/466)
	* [BigDecimal `valueOf()` Method in Java](https://www.geeksforgeeks.org/bigdecimal-valueof-method-in-java/)

##### [목차로 이동](#목차)