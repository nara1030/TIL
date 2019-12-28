10주차 - 마무리
=======
2019.12.28  
추후 수정 및 추가
- - - -
## 목차
1. [패턴과 함께 하는 행복한 삶](#패턴과-함께-하는-행복한-삶)
2. [여담](#여담)
3. [참고](#참고)

## 패턴과 함께 하는 행복한 삶
* p633, 리팩토링  
	```java
	public String method(int number)
	```
	* 리턴 타입 혹은 파라미터 타입을 변경하는 경우 리팩토링 아님(∵ 스펙, 즉 인터페이스 변경이기 때문)
	* private 메서드라면 관계 없음
* p644, 안티패턴
	1. 싱글톤
		* 상속 불가능
		* mock 대체 불가(참고: [Singleton Pattern의 함정](https://develogs.tistory.com/8))
			* [Singleton Registry](https://www.google.com/search?q=singleton+registry&oq=singleton+re&aqs=chrome.1.69i57j0l7.6835j0j7&sourceid=chrome&ie=UTF-8)
	2. Optional(참고: [자바8 Optional](https://www.daleseo.com/java8-optional-after/))
		* ~~`isPresent()`~~
		* 리턴타입 `ofNullable`

##### [목차로 이동](#목차)

## 여담
* 자주 사용하던 패턴이 Composite Pattern임을 알게 되고 디자인 패턴 스터디 시작 계기
* 면접에서 용어의 정의를 물어본다면 넓은, 좁은 의미 다 대답하는 것을 추천([Gyuwon Yi님](https://www.facebook.com/gyuwon.yi))
* REST에 대한 얘기는 이해하지 못했..
	* 쿼리스트링? 404 혹은 리소스 없는 것 중?
* 앞으로 스터디를 하게 된다면 병렬 프로그래밍 혹은 리액티브 프로그래밍 둘 중 하나가 될 거라고
	* [실전! 스프링5를 활용한 리액티브 프로그래밍](https://book.naver.com/bookdb/book_detail.nhn?bid=15045543)
	* [RxJava를 활용한 리액티브 프로그래밍](https://book.naver.com/bookdb/book_detail.nhn?bid=11976318): `단지 다른 구현체?`
	* [자바 병렬 프로그래밍](https://book.naver.com/bookdb/book_detail.nhn?bid=4683550): `JDK API 개발자..?`
* 추천
	* [폴리글랏 프로그래밍](https://book.naver.com/bookdb/book_detail.nhn?bid=7440444)
	* 토비님 강의
		* [자바 8 동시성](https://www.google.com/search?q=executorservice+java+8&oq=executeSer&aqs=chrome.3.69i57j0l7.7300j0j7&sourceid=chrome&ie=UTF-8)
		* `ExecuteService`, `Runnable`, `Callable`, `?`
	* [IT 개발자의 영어 필살기](https://book.naver.com/bookdb/book_detail.nhn?bid=15986525): [`박상길님 블로그?`](https://likejazz.com/)

##### [목차로 이동](#목차)

## 참고
* [실전에서의 디자인 패턴 - Phang's IT Blog](https://jihyehwang09.github.io/2019/12/28/design-pattern-etc/)

##### [목차로 이동](#목차)