객체지향 프로그래밍 입문 - 최범균
=====
[인프런 강좌](https://www.inflearn.com/course/%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%EC%9E%85%EB%AC%B8/)를 듣고 내용을 정리한다.  
최범균, madvirus@madvirus.net
- - -
## 목차
1. [요약](#요약)
	* [강의 목차](#강의-목차)
2. [참고](#참고)

## 요약

### 강의 목차
1. 들어가며
	* 비용
		* x-axis: Major release
		* y-axis
			* Cost/LOC(Lines of Code): x^2
			* Product Size(KLOC): x^1/2
	* 원인
		* 버전 업데이트
			* 레거시  
				```java
				long start = System.currentTimeMillis();
				// ...
				long end = System.currentTimeMillis();
				long elapsed = end - start;
				```
			* 개선  
				```java
				long start = System.nanoTime();
				// ...
				long end = System.nanoTime();
				long elapsednano = end - start;
				```
		* 조건 추가

##### [목차로 이동](#목차)
		
2. 객체

##### [목차로 이동](#목차)

3. 추상화

##### [목차로 이동](#목차)

4. 상속보단 조립

##### [목차로 이동](#목차)

5. 기능과 책임 분리

##### [목차로 이동](#목차)

6. 의존과 DI

##### [목차로 이동](#목차)

7. 정리

##### [목차로 이동](#목차)

8. 부록

##### [목차로 이동](#목차)

## 참고
* [개발자 치즈님의 강의 요약 정리](https://github.com/cheese10yun/TIL/blob/master/OOP/%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%EC%9E%85%EB%AC%B8.md)

##### [목차로 이동](#목차)