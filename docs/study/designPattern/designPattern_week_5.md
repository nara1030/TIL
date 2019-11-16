5주차 - Abstract Factory Pattern & Singleton Pattern
=======
2019.11.02: 추상 팩토리 패턴 및 싱글톤 패턴  
- - - -
## 목차
1. [추상 팩토리 패턴](#추상-팩토리-패턴)
2. [싱글톤 패턴](#싱글톤-패턴)
	* [고도화](#고도화)
3. [기타](#기타)
	* [면접 문제](#면접-문제)
	* [SOLID](#SOLID)
	* [Enum](#Enum)
4. [참고](#참고)
	
## 추상 팩토리 패턴


##### [목차로 이동](#목차)

## 싱글톤 패턴
* 싱글톤 패턴은 결국 전역 변수
* 안티 패턴
* `게으르게` → 메모리 효율적 사용 목적

##### [목차로 이동](#목차)

### 고도화
* `Double-checked` 이후(여기까진 교재 언급)
	* Idiom
	* 직렬화/역직렬화
	* Enum
		* [싱글톤 고도화 - Limky](https://limkydev.tistory.com/67)
	* 스프링 싱글톤 레지스트리(`bean` 등록 후 사용)

##### [목차로 이동](#목차)

## 기타
주제 외에 언급했던 부분을 간략하게 정리한다.

### 면접 문제
* 접근제어자
* 인터페이스 vs. 추상클래스

##### [목차로 이동](#목차)

### SOLID
* 구분
	1. `SRP`: Single responsibility principle(단일 책임 원칙)
		* 하나의 책임은 어디까지인가에 대한 고민 필요(ex. `밥을 먹는다`)
	2. `OCP`: Open/closed principle(개방-폐쇄 원칙)
	3. `LSP`: Liskov substitution principle(리스코프 치환 원칙)
		* 추상 메소드 오버라이딩 금지(∵ 레거시 맥락 파악 힘듦)
	4. `ISP`: Interface segregation principle(인터페이스 분리 원칙)
	5. `DIP`: Dependency inversion principle(의존관계 역전 원칙)
* 팁: 주관적 이해 반영
	* DIP(`추상`)가 OCP(`구체`)의 전제조건
	* SRP는 `제공`의 관점, LSP/ISP는 `소비`의 관점에서 이해(ex. `복합기`)
	* LSP: [참고](http://wonwoo.ml/index.php/post/1780)  
		> 상위 타입의 객체를 하위 타입의 객체로 치환해도 상위 타입을 사용하는 프로그램은 정상적으로 동작해야 함
		* 해석1: 추상 메소드 오버라이딩 금지
		* 해석2: 추상 메소드 오버라이딩을 **어떻게** 하느냐가 관건
	* [??](https://github.com/nara1030/portfolio/blob/master/docs/lecture_list/code_spitz/s83_object1/object1_ch10.md)
	
##### [목차로 이동](#목차)

### Enum
스터디에서 다뤘던 코드. `1 -> 2 -> 3` 순으로 최신 코드. [참고](https://inor.tistory.com/12)(`추후 삭제`)

1. `1`  
	```java
	import lombok.AllArgsConstructor;
	
	@AllArgsConstructor
	public enum Code1 implements Runnable {
		A("a") {
			@Override
			public void run() {
				System.out.println("hello");
			}
		},
		B("b") {
			@Override
			public void run() {
				System.out.println("hi");
			}
		},
		C("c") {
			@Override
			public void run() {
				System.out.println("dobrizen");
			}
		};
		
		private String name;
	}
	```
2. `2`  
	```java
	// 기억이 살려 하긴 했으나 추후 확인 필요
	import lombok.AllArgsConstructor;
	@AllArgsConstructor
	public enum Code2 {
		A("a") {
			@Override
			void run() {
				System.out.println("hello");
			}
		},
		B("b") {
			@Override
			void run() {
				System.out.println("hi");
			}
		},
		C("c") {
			@Override
			void run() {
				System.out.println("dobrizen");
			}
		};
		
		private String name;
		
		abstract void run();
	}
	```
3. `3`  
	```java
	import lombok.AllArgsConstructor;
	
	@AllArgsConstructor
	public enum Code3 {
		A("a", () -> System.out.println("hello"),
		B("b", () -> System.out.println("hi"),
		C("c", () -> System.out.println("dobrizen"));
		
		private String name;
		private Runnable runnable;
		
		public void run() {
			this.run();
		}
		
	//	확인
	//	private Code3(String name, Runnable runnable) {
	//		this.name = name;
	//	}
	}
	```

##### [목차로 이동](#목차)
	
아래 자료 등을 바탕으로 [여기](https://github.com/nara1030/ThisIsJava/blob/master/docs/etc/java_enum.md)에 추후 정리해나갈 예정.

#### 기본
* [Enum 클래스의 사용과 이해 - 생활코딩](https://www.opentutorials.org/module/1226/8025)
	* 생성자를 `private`로 제한해야 다른 곳에서 newInstance로 생성 불가
* [Enum이란 - Limky](https://limkydev.tistory.com/50)
	* Enum의 등장 배경(cf. `final static`)
* [Enum의 사용법 - Limky](https://limkydev.tistory.com/66)
	* Static method
	* Non-static method: 헷갈리네!??
* [Java Enum - HowToDoInJava](https://howtodoinjava.com/java/enum/enum-tutorial/)

#### 심화
* [Enum 활용 - 기억보단 기록을](https://jojoldu.tistory.com/122)
* [Enum 활용기 - 우아한 형제들](http://woowabros.github.io/tools/2017/07/10/java-enum-uses.html)
	
##### [목차로 이동](#목차)

## 참고
* [Singleton Pattern - LichKing](https://multifrontgarden.tistory.com/260?category=471239)
* [스터디 요약정리 - Phang's IT Blog](https://jihyehwang09.github.io/2019/11/03/design-pattern-singleton/)
* [SOLID - 객체지향 설계 원칙](https://ko.wikipedia.org/wiki/SOLID_(%EA%B0%9D%EC%B2%B4_%EC%A7%80%ED%96%A5_%EC%84%A4%EA%B3%84))
- - -
* [Java Singletons Using Enum - DZone](https://dzone.com/articles/java-singletons-using-enum)
* [Singletons in Java - Baeldung](https://www.baeldung.com/java-singleton)
* [Why Enum Singleton are better in Java - Javarevisited](https://javarevisited.blogspot.com/2012/07/why-enum-singleton-are-better-in-java.html)
* [How to create thread safe Singleton in Java - Javarevisited](https://javarevisited.blogspot.com/2012/12/how-to-create-thread-safe-singleton-in-java-example.html)

##### [목차로 이동](#목차)