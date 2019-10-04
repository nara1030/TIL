15장. 디자인 패턴과 프레임워크
=====
이 책의 마지막 장으로 주제가 나온다.  
주제는 `비지터 패턴`으로 이번 강의에서는 `컴포지트 패턴`과 `비지터 패턴`을 다룬다.
- - -
## 목차
1. [참고](#참고)
	* [관련자료](#관련자료)
	* [책의 목차](#책의-목차)
2. [요약](#요약)
	* [디자인 패턴 개요](#디자인-패턴-개요)
	* [책에서 다루는 디자인 패턴](#책에서-다루는-디자인-패턴)
	* [코딩 흐름](#코딩-흐름)
		* [Composite](#Composite)
		* [Visitor](#Visitor)
	*

## 참고
### 관련자료
* [유투브 강의](https://www.youtube.com/watch?v=2fdwzbSnqZc)
* [소스 코드](https://github.com/step4me/codespitz-s84-4?fbclid=IwAR2BYXQWWGG_9euHFqfKCnBtsgZFpFbcguvZZfRVPDUGadN7WP9U28vMOAk)
* [오브젝트 요약정리](https://github.com/nara1030/portfolio/blob/master/docs/book/object.md)
* 기타
	* [IoC - 기계인간](https://johngrib.github.io/wiki/spring-ioc/)

##### [목차로 이동](#목차)

### 책의 목차


##### [목차로 이동](#목차)

## 요약
### 디자인 패턴 개요
보통 책에서 언급하는 디자인 패턴은 아래와 같고, 이외에는 곁가지라 해도 무방하다.

1. [템플릿 메소드 패턴](object1_ch10.md): 상속(`좋은 상속`)
2. 전략 패턴: 구성(조립)
3. [컴포지트 패턴](https://github.com/nara1030/portfolio/blob/master/docs/study/designPattern/temp/composite_pattern.md): 파일 탐색기
	* 비지터 패턴: 제어 위임
4. 데코레이터 패턴
5. Chain of Responsebility
6. 커맨드 패턴

### 책에서 다루는 디자인 패턴
이 책에서 언급하는 디자인 패턴에는 크게 세 가지가 있다.

* 영화 예매 프로그램
	1. 템플릿 메소드 패턴
	2. 전략 패턴
* 핸드폰 요금 계산 프로그램
	1. 데코레이터 패턴

하지만 중간에 `할인 정책`에서 컴포지트 패턴을

##### [목차로 이동](#목차)

### 코딩 흐름
동영상을 복기하며 디자인 패턴뿐 아니라 디테일한 코딩 관습까지 암기하는 것을 목표로 한다. 강의자님이 말한 코드를 보고 의도를 파악하는 습관을 키우기 위해서 우선 기준이 필요하기 때문에.

#### Composite
`Todo` 앱을 코딩한다.

1. Task
	* [소스 확인](./src/codespitz_s84_4/Task.java)
	* 생각의 흐름
		1. 필드 초기화 선택
			* `기본값 넣기` 혹은 `외부에서 받기`
				* 즉, `선언 동시 초기화`(기본값) 혹은 `생성자 초기화`(외부)
			* `final` 선언 안 한 이유는 변수기 때문(Todo 앱에서 보통 바뀔 수 있음)
		2. 모델 생성 시 행위 제약, 즉 캡슐화 필요(`?`)
			* `isComplete` 변수에 대한 setter 불필요
				* ∵ Todo 앱에서 실제로 할 수 있는 유일한 행위는 check
				* ∴ `toggle()` 메소드를 `public`으로 노출
			* 객체는 본인의 상태를 스스로 관리하는, `state management`의 책임 있음
		3. 아직 좋은 클래스는 아님(ex. `final` 미선언)
		
##### [목차로 이동](#목차)
		
2. Tasks
	* [소스 확인](./src/codespitz_s84_4/Tasks.java)
	* 생각의 흐름
		1. `Task`는 하나의 task일 뿐이고, task를 담을 그릇이 필요
			* Todo 앱을 보면 `폴더` 안에 `todo`가 존재
		2. 필드
			* `title`: 폴더 이름이 필요(변동 가능성 존재하므로 `final` 미선언)
			* `list`: task들을 갖고 있는 List(변동 가능성이 없으므로 `final` 선언)
		3. 행위 제약
			* `title` 변수에 대한 setter 생성(∵변동 가능성)
				* 코드 중복 제거(`?`)  
					```java
					public class Tasks {
						private String title;
						
						public Tasks(String title) {
							// this.title = title;
							setTitle(title);
						}
						
						public void setTitle(String title) {
							this.title = title;
						}
					}
					```
			* add 및 remove 메소드 생성  
				기본적으로는 리턴형을 `boolean`으로 하나, 편의를 위해 `void`로 선언
				1. add
					* 외부에서 `Task`를 받을 수 있는 경우(`public void addTask(Task task)`)
						* 즉, `Task`의 생성자를 `외부`에 공개한 경우
							* 외부에서 `Task`를 만들게 할지는(`new 호출`) 모르겠으나 확실한 것은 `Task` 변경의 권한을 외부에 푸는 순간 `Task` 생성자 함부로 수정 불가
						* 따라서 `Task`를 `Tasks`만 만들 수 있게 수정해야지만 `Task` 수정 가능
							* 그럼에도 불구하고 만약 인자로 `Task`를 받는다면 프로젝트 초창기엔 상당한 비용 감수해야 `Task` 수정 가능
					* 외부에서 `Task`를 받지 못하게 하는 경우(`public void addTask(String title, LocalDateTime date)`)
						* 어쩔 수 없이 `Task`를 외부에 공개해야 하는 시점까진 `primitive`로 Task 추가
						* 또한 Task 생성자의 접근 범위를 `public`에서 `default`로 수정
						* 정리
							* 이것만으로 `Task` 수정의 여파는 `Tasks`까지만 미침
							* public 객체지만 생성자가 public이 아닌 건 당연한 거고 맞는 것임(외부에서 `new`할 수 있는 객체를 최소화)
				2. remove
					* add와 달리 remove는 외부에서 `Task`를 받아야 함(`public void removeTask(Task task)`)
						* 존재해야지만 지울 수 있음
							* `Task`는 public 클래스(생성자가 `default`인 것과 무관)
						* ∵ 객체지향에서 객체는 `값`이 아닌 `메모리 주소`로 식별
							* ∴ 만약 `값`으로 지운다면 같은 `title`을 갖고 있는 다른 객체가 지워질 가능성 존재
			* getList 메소드 생성  
				`Tasks`만 list(`Set`)를 갖고 있는데 외부에서도 list를 갖고 있어야 렌더링 가능하므로 공개 필요
				* 얕은 복사  
					```java
					public List<Task> getList() {
						List<Task> tasks = new ArrayList<>(list);
						return tasks;
					}
					```
					* 외부에 출력할 때 원본이 아닌 사본 정책 사용(`얕은 복사`)
						* 외부에 객체 공개하면 객체의 메소드 호출, 즉 원본 조작
						* `Task`는 원래 public, 즉 조작 가능 의도(∴ `깊은 복사` 무의미)
					* 이렇게(`?`) 하면 메모리 부하를 신경쓸 필요 없음
				* Sort  
					```java
					public List<Task> getList(SortType type) {
						List<Task> tasks = new ArrayList<>(list);
						tasks.sort(type);	// 예상
						return tasks;
					}
					```
					* 보통 List는 `Sort`해서 리턴(ex. `가나다`, `날짜순`, `체크별(?)` 등)
					* 이때 `Sort`하는 방법은 외부에서 받음
						* 정적으로 관리 위해 Enum(`SortType`) 생성
					* 객체지향은 `위임`하기 때문에 switch문(if문) 사용 안함
						* `tasks.sort(type);`
						* 즉, `type`을 전략 객체로 보면 됨

##### [목차로 이동](#목차)
					
3. SortType
	* [소스 확인](./src/codespitz_s84_4/SortType.java)
	* 생각의 흐름
		* 37:00
4.

##### [목차로 이동](#목차)

#### Visitor

##### [목차로 이동](#목차)
