함수형 프로그래밍에 대해 말해보세요(feat. Immutable).
=====
## 목차
1. [답변](#답변)
2. [관련](#관련)
	* [자바](#자바)
3. [코드](#코드)
4. [참고](#참고)

## 답변
> 함수형 프로그래밍이란

**Functional programming**(often abbreviated FP) is the process of building software by composing **pure functions**, avoiding **shared state**, **mutable data**, and **side-effects**.

> 왜 함수형 프로그래밍인가

The reason people say functional languages are better for parallel processing is due to the fact that they **usally** avoid mutable state.

##### [목차로 이동](#목차)

## 관련
### 자바
자바는 객체 지향 프로그래밍이 소프트웨어 개발의 주요 패러다임이었던 1990년대에 디자인되었다. 하지만 최근 들어 함수적 프로그래밍이 부각되고 있는데, **병렬 처리**와 **이벤트 지향 프로그래밍**에 적합하기 때문이다. 그래서 객체 지향 프로그래밍과 함수적 프로그래밍을 혼합함으로써 더욱 효율적인 프로그래밍이 될 수 있도록 개발 언어가 변하고 있다.

자바는 함수적 프로그래밍을 위해 자바 8부터 람다식(Lambda Expressions)을 지원하면서 기존의 코드 패턴이 많이 달라졌다. 람다식은 런타임에 익명 함수(anonymous function)를 생성하기 위한 식으로 객체 지향 언어보다는 함수 지향 언어에 가깝다. 자바에서 람다식을 수용한 이유는 다음과 같다.

1. 자바 코드가 간결해진다
2. 컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게 집계할 수 있다(Stream)
	* 스트림[1]은 자바 8부터 추가된 컬렉션(배열 포함)의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자

스트림 단점.

- - -
* [1]
	1. Iterator(자바 7 이전)와 비슷한 역할을 하는 반복자이지만 람다식으로 요소 처리 코드를 제공
	2. 내부 반복자를 사용하므로 병렬 처리가 쉬움(개발자는 요소 처리 코드에만 집중 가능)
	3. 중간 처리와 최종 처리 작업을 수행
* [2]
	* .

##### [목차로 이동](#목차)

## 코드


##### [목차로 이동](#목차)

## 참고
* [Master the JavaScript Interview: What is Functional Programming?](https://medium.com/javascript-scene/master-the-javascript-interview-what-is-functional-programming-7f218c68b3a0)
* [The need for Functional Programming](https://softwareengineering.stackexchange.com/questions/310159/is-functional-programming-faster-in-multithreading-because-i-write-things-differ)
* [Difference between FP and OOP](https://www.geeksforgeeks.org/difference-between-functional-programming-and-object-oriented-programming/)
* What's Wrong with Java 8
	1. [Currying vs Closures](https://dzone.com/articles/whats-wrong-java-8-currying-vs)
	2. [Functions & Primitives](https://dzone.com/articles/whats-wrong-java-8-part-ii)
	3. [Streams and Parallel Streams](https://dzone.com/articles/whats-wrong-java-8-part-iii)
* [자바 8 Stream API와 주의사항](https://okky.kr/article/329818)
	
- - -
* https://medium.com/@lazysoul/%ED%95%A8%EC%88%98%ED%98%95-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%EC%9D%B4%EB%9E%80-d881230f2a5e
* https://poiemaweb.com/js-immutability
* https://engineering.linecorp.com/ko/blog/functional-programing-language-and-line-game-cloud/

##### [목차로 이동](#목차)