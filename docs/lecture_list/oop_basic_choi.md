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
		* 개념
			* 절차지향: 데이터를 여러 프로시저가 공유하는 방식
			* 객체지향
				* 데이터와 프로시저를 객체라는 단위로 묶는 방식
				* 특정 객체가 갖고 있는 데이터는 그 객체의 프로시저만 접근할 수 있도록 함
					* 따라서 다른 객체에서는 해당 객체의 데이터에 바로 접근 불가
					* 이것이 **캡슐화**이고, 시간이 지나도 유지봏수(변경)가 쉬운 이유
				* 객체는 프로시저를 이용해 외부에 기능을 제공함
					* 즉 객체와 객체는 다른 객체의 프로시저를 호출하는 방식으로 서로 상호작용
		* 비교
			* 시간이 흘러갈수록 데이터를 공유하는 방식(절차지향)은 유지보수가 힘듦
				* 절차지향과 비용
					* 레거시  
						```java
						// 인증 API
						Account account = findOne(id);
						if(account.getState() == DELETED) {
						
						}
						
						// 암호 변경 API
						Account account = findOne(id);
						if(account.getState() == DELETED) {
						
						}
						```
						* 인증 API 코드와 암호 변경 API 코드에서 state 데이터(상태)를 공유하고 있음
					* 시간이 지남에 따라 변경된 코드  
						```java
						Account account = findOne(id);
						if(account.getState() == DELETED || 
							account.getBlockCount() > 0 ||
							account.getEmailVerifyStatus() == 0) {
						
						}
						
						// 암호 변경 API
						Account account = findOne(id);
						if(account.getState() == DELETED || 
							account.getBlockCount() > 0 ||
							account.getActiveStatus() == ENABLE) {
						
						}
						```
						* 개선점
							* 조건을 변수로 정의함으로써..
							* 객체지향적으로..
	* 객체
		* 객체의 핵심 → 기능 제공
			* 객체는 제공하는 기능으로 정의(객체를 사용하는 입장에서 생각)
			* 내부적으로 가진 필드(데이터)로 정의하지 않음
		* 예
			* 회원 객체
				* 암호 변경하기 기능
				* 차단 여부 확인하기 기능
			* 소리 제어기 객체
				* 소리 크기 증가하기 기능
				* 소리 크기 감소하기 기능
		* 기능 명세
			* 제공하는 기능을 어떻게 사용하는지 알려주는 것
				* cf. [메서드 시그니처](https://github.com/nara1030/ThisIsJava/blob/master/docs/etc/polymorphism.md)
			* 메서드(오퍼레이션)를 이용해서 기능 명세
				* 이름, 파라미터, 결과로 구성
			* 예
				* 회원 객체  
					```java
					public class Member {
						public void changePassword(String curPw, String newPw) {
							// ...
						}
					}
					```
				* 소리 제어기 객체  
					```java
					public class VolumeController {
						public void increase(int inc) {
							// ...
						}
						
						public void decrease(int dec) {
							// ...
						}
						public int volume() {
							// ...
						}
					}
					```
		* 객체와 객체
			* 객체와 객체는 기능을 사용해서 연결
				* 기능 사용 = 메서드 호출
			* 예  
				```java
				VolumeController volCont = new VolumeController();
				volCont.increase(4);
				volCont.decrease(3);
				int currentVol = volCont.volume();
				```
			* 용어: 메시지
				* 객제지향에서 종종 사용하는 용어
				* 객체와 객체 상호작용: **메시지**를 주고 받는다고 표현
					* 메서드를 호출하는 메시지, 리턴하는 메시지, 익셉션 메시지
				* 다이어그램  
					<img src="./img/oop_diagram.png" width="600" height="250"></br>
			* 객체?
				* 데이터에 접근하는 것 외에 특별한 기능이 없는 클래스  
					```java
					public class Member {
						private String name;
						private String id;
						
						public void setName(String name) {
							this.name = name;
						}
						
						public String getName() {
							return name;
						}
						
						public void setId(String id) {
							this.id;
						}
						
						public String getId() {
							return id;
						}
					}
					```
				* 객체라기보단 **데이터**에 더 가까움
					* 데이터 클래스, 구조체라는 표현도 사용
	* 캡슐화
		* .

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