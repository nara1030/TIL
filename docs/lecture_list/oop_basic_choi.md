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
	* 비용 증가
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
			* 레거시  
				```java
				int mode = 10;
				if(mode == 10) {
					// ...
				}
				
				if(mode != 10) {
					// ...
				}
				```
			* 개선  
				```java
				int mode = 10;
				if(mode == 10) {
					// ...
					if(조건) {
						mode = 20;
					}
					// ...
				}
				
				if(mode != 10) {
					// ...
				}
				```  
					* 이 경우 변경된 코드 때문에 아래 if문이 실행되는 문제가 있음
						* 코드 분석 및 변경 시간 증가
					* if문 2개를 사용하는 것보다 if-else문을 사용하는 것이 낫다고 판단됨
	* 소프트웨어의 가치: 변화  
		> Software maintenance is not "keep it working like before".  
		> It is "keep being useful in a changing world".
	* 비용과 변화
		* 낮은 비용으로 변화할 수 있어야 함
		* 해결방안
			* 패러다임
				* 객체지향, 함수형, 리액티브, ...
			* 코드, 설계, 아키텍처
				* DRY, TDD, SOLID, DDD, ...
				* 클린 아키텍처, MSA, ...
			* 업무 프로세스/문화
				* 애자일, DevOps, ...
		* 이 중 **객체지향**이 비용을 낮춰주는 방법
			* 캡슐화 + 다형성(추상화)
					
##### [목차로 이동](#목차)
		
2. 객체
	* 절차지향 vs 객체지향
	* 

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