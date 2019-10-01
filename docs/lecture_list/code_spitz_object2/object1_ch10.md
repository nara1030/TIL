10장. 상속과 코드 재사용
=====
오브젝트1(코드스피츠83) 마지막 강의다.
- - -
## 목차
1. [참고](#참고)
	* [관련자료](#관련자료)
	* [책의 목차](#책의-목차)
2. [요약](#요약)
	* [강의 목표](#강의-목표)
	* [합성과 의존성](#합성과-의존성)
	* [템플릿 메소드 패턴](#템플릿-메소드-패턴)
	* 14:40

## 참고
### 관련자료
* [유투브 강의](https://www.youtube.com/watch?v=xb0a2QxocaE)
* [강의 교안]()
* [오브젝트 요약정리](https://github.com/nara1030/portfolio/blob/master/docs/book/object.md)

### 책의 목차

##### [목차로 이동](#목차)

## 요약
### 강의 목표
디자인 패턴에서 가장 중요한 것을 꼽으면 두 가지가 있다.

* 추상팩토리 메소드 패턴
* 커맨드 패턴

이번 강의에선 `추상팩토리 메소드 패턴`의 복잡한 양상이 의존성과 어떤 관계를 가지는지 알아본다.

##### [목차로 이동](#목차)

### 합성과 의존성
합성과 상속을 비교하는 것을 많이 본다. 디자인 패턴으로 예를 들면, 각각 `전략 패턴`과 `템플릿 메소드 패턴`을 비교하는 것으로 볼 수 있다. 하지만 합성이든 상속이든 객체간의 관계, 즉 의존성에 관한 문제다.

그렇다면 의존성을 `적절히` 관리하는 방법은 무엇일까? 오직 의존성의 방향을 `단방향`으로 해주는 것 뿐이다.

##### [목차로 이동](#목차)

### 템플릿 메소드 패턴
* 필요성
	* 상속이 나쁜 것은 아니나 사용시 부모의 변화가 자식에 여파를 일으키지 않는 스킬 사용 필요
	* 템플릿 메소드 패턴(`상속의 올바른 사용 예`)의 존재 자체가 상속의 단점을 반증
* 차이점(`상속`과 비교)
	* 의존성의 방향이 역전됨
	* 의존성 방향
		* 상속
			* 자식이 부모를 가리키는(아는) 방향(`업캐스팅`)
		* 템플릿 메소드
			* 반대로 부모가 자식을 알고 있음(`다운캐스팅`: 리스코프 치환원칙 위배`(??)`)
			* How? 추상 메소드(`인터페이스`)를 이용
				* 즉, 자식을 직접 구현하고 있는 것이 아닌 인터페이스를 통해 통신
				* 자식은 부모를 몰라도 되고(`extend`하니 알긴 아나 의존하지 않는다고 말하는 편이 정확) 자신의 책임(`calculateFee 메소드`)만 구현, 대신 부모가 자식을 아는 상황으로 역전시켜놓음
* 코드
	* 부모  
		```java
		abstract class DiscountPolicy {
			private Set<DiscountCondition> conditions = new HashSet<>();
			public void addCondition(DiscountCondition condition) {
				conditions.add(condition);
			}
			public Money calculateFee(Screening screening, int count, Money fee) {
				for(DiscountCondition condition : conditions) {
					if(condition.isSatisfiedBy(screening, count)) {
						return calculateFee(fee);
					}
				}
			}
			protected abstract Money calculateFee(Money fee);
		}
		```
	* 자식  
		```java
		public class AmountPolicy extends DiscountPolicy {
			private final Money amount;
			public AmountPolicy(Money amount) {
				this.amount = amount;
			}
			@Override
			public Money calculateFee(Money fee) {
				return fee.minus(amount);
			}
		}
		```
	* 코드 분석
		* `템플릿 메소드`는 `훅`(추상 메소드)을 사용하는 메소드
		* 접근 제한자는 약속(`프로토콜`)임
			* 부모와 통신을 할 때는 부모의 지식을 함부로 사용하지 않고 미리 확정되어 있는 프로토콜(`protected abstract`)만을 이용해서 대화
			* `private`이 아닌 `protected`, `default` 같은 속성들 혹은 그에 준하는 getter 및 setter가 부모에 있다면 그 클래스는 건들지 말란 소리
		* [할리우드 원칙](https://johngrib.github.io/wiki/spring-ioc/#hollywood-principle): `Tell, Don't ask`
			* 자식이 부모의 지식을 getter로 읽어들여서 하지 않고(그 반대도 마찬가지), 서로 시킬 뿐임
* 장점
	* 의존성 역전되므로 자식의 수정이 부모에게 영향을 끼치지 않을 뿐더러, **부모의 수정도 자식에게 영향을 미치지 않음**
		* 부모에 의존하는 자식을 만든게 아니라 독립된 인터페이스(추상 메소드)를 만들고 그것을 구현하는 자식을 만들기 때문(실제 behavior는 부모가 처리)
			* `부모에 의존하는 자식`이란 일반적인 상속으로, 자식이 부모의 세부구현을 알고 그것을 이용
			* 즉, 자식은 제한되어 있는 자신의 책임만을 구현하면 됨

##### [목차로 이동](#목차)