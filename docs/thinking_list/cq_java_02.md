Thread가 3개 생성되었을 때 t1, t2, t3의 순서가 보장되는 코드를 짜보세요.
=====
개인적 생각이므로 피드백 환영합니다.
- - -
## 목차
1. [답변](#답변)
2. [관련](#관련)
	1. [스레드 구현](#스레드-구현)
	2. [스레드 생명주기](#스레드-생명주기)
	3. .
3. [참고](#참고)

## 답변
두 가지 생각이 떠올랐는데, 두 번째 경우를 생각해 접근했다.

1. [스레드 스케쥴링](https://endorphin0710.tistory.com/27)
2. [동기/비동기](https://cornswrold.tistory.com/187)
	* [How to Run Threads in Sequence - Java Program](https://netjs.blogspot.com/2016/10/how-to-run-threads-in-sequence-java-program.html)

- - -
* [Printing Numbers in Sequence Using Threads - Java Program](https://netjs.blogspot.com/2018/04/printing-numbers-sequence-using-threads-java-program.html)
* [Printing sequence using 3 threads in java](https://java2blog.com/print-sequence-3-threads-java/)

##### [목차로 이동](#목차)

## 관련
```txt
- 예제에서는 static 클래스로 생성하지 않네?

```

### 스레드 구현
다음 게시물([Implementing a Runnable vs Extending a Thread](https://www.baeldung.com/java-runnable-vs-extending-thread))에서 발췌한다.

#### Runnable or Thread?
일반적으로 아래와 같은 이유로 Thread 클래스를 확장하는 것보다 Runnable을 구현하는 것을 더 권장한다.

1. Thread 클래스를 확장할 때 메소드를 재정의하지 않는다  
(Runnable을 구현할 때와 달리 mandatory하지 않다는 의미인가?)
2. Runnable의 구현을 Thread 클래스에 전달하면 상속이 아닌 컴포지션을 활용한다  
	```java
	// Thread의 확장(SumThread extends Thread)
	Thread thread = new SumThread();
	thread.start();
	
	// Runnable 구현(SumThread implements Runnable)
	Runnable runnable = new SumThread();
	Thread thread = new Thread(runnable);
	thread.start();
	```
3. Thread 클래스를 확장한 후에는 다른 클래스를 확장할 수 없다
4. Java 8부터 Runnable은 람다식으로 표현 가능하다

- - -
* [예제 코드](https://github.com/eugenp/tutorials/blob/master/core-java-modules/core-java-concurrency-basic/src/test/java/com/baeldung/concurrent/runnable/RunnableVsThreadLiveTest.java)
* [예제 코드 확인](https://github.com/nara1030/TIL/blob/master/docs/thinking_list/interview/src/test/java/baeldung/concurrent/runnable/RunnableVsThreadLiveTest.java)

##### [목차로 이동](#목차)

### 스레드 생명주기
다음 게시물([Life Cycle of a Thread in Java](https://www.baeldung.com/java-thread-lifecycle))을 보고 정리힌다.


- - -
* [예제 코드](https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java-concurrency-basic-2/src/main/java/com/baeldung/concurrent/threadlifecycle)
* 예제 코드 확인

##### [목차로 이동](#목차)

## 참고
* [멀티 스레드 - 이것이 자바다](https://github.com/nara1030/ThisIsJava/blob/master/docs/%EB%A9%80%ED%8B%B0%20%EC%8A%A4%EB%A0%88%EB%93%9C.md)
* tutorials
	1. [Core Java Concurrency Basic](https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java-concurrency-basic)
* Baeldung
	1. [Implementing a Runnable vs Extending a Thread](https://www.baeldung.com/java-runnable-vs-extending-thread)
	2. [Life Cycle of a Thread in Java](https://www.baeldung.com/java-thread-lifecycle)
* [Difference between wait() and sleep()](https://stackoverflow.com/questions/1036754/difference-between-wait-and-sleep)
* .

- - -
* https://okky.kr/article/505772
* https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.State.html
* [멀티 스레드 환경에서 스프링 빈 주의사항](https://beyondj2ee.wordpress.com/2013/02/28/%EB%A9%80%ED%8B%B0-%EC%93%B0%EB%A0%88%EB%93%9C-%ED%99%98%EA%B2%BD%EC%97%90%EC%84%9C-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B9%88-%EC%A3%BC%EC%9D%98%EC%82%AC%ED%95%AD/)
* [스레드 덤프 분석하기](https://d2.naver.com/helloworld/10963)

##### [목차로 이동](#목차)