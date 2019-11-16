6주차 - 커맨드 패턴 및 어댑터/퍼사드 패턴
=======
2019.11.16: 스터디 시작 전 질문  
내용 관련해선 추후 정리
- - - -
## 목차
1. [커맨드 패턴](#커맨드-패턴)
	* 널 오브젝트 패턴
2. [어댑터 패턴](#어댑터-패턴)
	* Enumeration
3. [퍼사드 패턴](#퍼사드-패턴)
	* 데메테르의 법칙
4. [참고](#참고)
	* [이직 조언](#이직-조언)
	* [코드 중복](#코드-중복)
	
## 커맨드 패턴


##### [목차로 이동](#목차)

## 어댑터 패턴


##### [목차로 이동](#목차)

## 퍼사드 패턴


##### [목차로 이동](#목차)

## 참고
### 이직 조언
* 선택 자체는 중요하지 않고, 그 이후 실행이 중요하다.
* 회사 선택 시 지원 요건 자세히 볼 필요없다(ex. 경력 등).
* 경력 1~2년 인정받고 못 받고는 큰 의미없다.
* 블로그 등 공부의 흔적 및 관심이 취업에 영향을 미쳤다.

짧게 나마 내 상황을 말씀드렸는데, 비슷한(?) 상황을 겪은 바 있었다 얘기를 들었다. 관련 글을 [링크](https://multifrontgarden.tistory.com/202?category=471261)한다.

##### [목차로 이동](#목차)

### 코드 중복
현업에서 흔히 볼 수 있는 `코드 중복` 사례를 두 가지 언급했다.

1. 메소드 오버로딩
	* 원 코드  
		```java
		public void method1(String name){
			System.out.println("이름: " + name);
		}
		```
	* 요구사항: `메소드 파라미터 추가`  
		```java
		// 방법 - 1: 기존 코드 수정(OCP 위배)
		public void method1(String name, int age){
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
		}
		
		// 방법 - 2: 코드 중복
		public void method1(String name){
			System.out.println("이름: " + name);
		}
		
		public void method1(String name, int age) {
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
		}
		```
	* 리팩토링  
		```java
		public void method1(String name){
			method1(name, null);	// 기본서 확인 필요
		}
		
		public void method1(String name, int age) {
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
		}
		```
2. . 

##### [목차로 이동](#목차)
