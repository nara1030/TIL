Call by value, Call by reference에 대해 설명해보세요.
=====
* 일전에 이 내용에 대해 정리한 게시글: [링크](https://github.com/nara1030/ThisIsJava/blob/master/docs/%EB%B3%80%EC%88%98%EC%99%80%20%ED%83%80%EC%9E%85.md)
* 질문에 대한 **답변**, 외에 더 알아볼만한 개념 등은 **관련**
- - -
## 목차
1. [답변](#답변)
2. [관련](#관련)
	- [자바](#자바)
	- [코딩 관습](#코딩-관습)
3. [참고](#참고)

## 답변
```txt
- Functions can be invoked in two ways: Call by Value or Call by Reference.
  - These two ways are generally differentiated by the type of values passed to them as parameters.
- Call by Value
  - In this parameter passing method, values of actual parameters are copied to function's formal parameters
    and the two types of parameters are stored in different memory locations. 
- Call by Reference
  - Both the actual and formal parameters refer to same locations,
    so any changes made inside the function car actually reflected in actual parameters of caller.
```

다시 말해 다음과 같이 말할 수 있다.

- 함수 호출 방식의 차이로, 인자로 전달해주는 매개변수의 타입에 따라 구분
- `call by value`
	- 함수의 매개변수로 전달될 때 복사된 값이 전달되므로 매개변수의 변화가 실제 인자에 영향 미치지 못함  
	(∵ 두 변수는 서로 다른 스택에 위치)
- `call by reference`
	- 전달된 인자와 함수의 매개변수가 서로 같은 메모리 공간을 참조  
	(∴ 함수 내부 매개변수 변경의 여파가 밖에도 미침)

##### [목차로 이동](#목차)

## 관련
### 자바
자바는 call by value라고 한다. 즉 위에서 설명한대로라면 전달 인자와 함수 매개변수가 서로 다른 메모리 공간(Stack? Heap?)을 참조하는 것이다.

* [Is Java `pass-by-reference` or `pass-by-value`? - stackoverflow](https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value)
* [Java가 call by value인 이유 - OKKY](https://okky.kr/article/584557)

- - -
사실 이 부분은 정확히 이해가 안 가지만 코드 자체의 동작에 대해 이해는 가기에 넘긴다. 특히 두 번째 답변 글의 예로 나오는 아래 코드는 두 변수가 서로 다른 스택에 있는 것은 알겠는데 처음 참조 대상(힙)은 같기에 왜 call by value인지 헷갈린다.

```java
public void foo(Dog someDog) {
    someDog.setName("Max");     // AAA
    someDog = new Dog("Fifi");  // BBB
    someDog.setName("Rowlf");   // CCC
}
```

##### [목차로 이동](#목차)

### 코딩 관습
이에 대한 개념도 중요하지만, 게시글 아래 어떤 분이 적어주신 개발 잠언(?)을 접하고 필요성을 깨달아 몇 가지 적어본다.

- 상태를 변경하는 함수는 값을 반환하면 안 된다
- 값을 반환하는 함수는 상태를 변경하면 안 된다

질문의 내용을 넘어 객체지향, 함수형 등 언어 패러다임까지 관련이 있다고 느껴졌다.

- Java 개발 시 매개변수를 ref. 하지 않은 형태로 개발해야 한다
- 레퍼런스 타입이라도 String처럼 Immutable 클래스가 있고, List 같은 컬렉션들은 일반 객체처럼 동작하니 혼란스러운 부분 존재한다

이 부분은 이해가 갈듯 말듯 한데 관련 내용을 좀 더 찾고 정리해야 한다.

##### [목차로 이동](#목차)

## 참고
* [Difference between call-by-value and call-by-reference - GeeksforGeeks](https://www.geeksforgeeks.org/difference-between-call-by-value-and-call-by-reference/)
* [Is Java `pass-by-reference` or `pass-by-value`?](https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value)
* clean-coders
	1. [2013년 7~9월 클린 코더스 강의 정리](https://github.com/msbaek/clean-coders-2013)
	2. [클린코더스 강의 정리_1](https://yangbongsoo.gitbook.io/study/clean_coders)
	3. [클린코더스 강의 정리_2](https://github.com/jojoldu/review/blob/master/%EB%B0%B1%EB%AA%85%EC%84%9D_%ED%81%B4%EB%A6%B0%EC%BD%94%EB%8D%94%EC%8A%A4/README.md)

##### [목차로 이동](#목차)