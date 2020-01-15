[CodeSpitz86] 객체지향 자바스크립트
=====
* 일시: 2020.01.08(수), 20:00 ~ 22:00
* 장소: 홍대입구역 한빛미디어 강의장
- - -
## 목차
1. [참고자료](#참고자료)
2. [강의 요약](#강의-요약)
	* [Value Context vs Identifier Context](#Value-Context-vs-Identifier-Context)
	* [Polymorphism](#Polymorphism)
		* [Polymorphism of Prototype](#Polymorphism-of-Prototype)
	* Object essentials
		* Isolation of change
	* 알려진 설계요령
		* SOLID
		* 기타
	* Message
	* Dependency
		* Dependency Inversion
		* Inversion of Control

## 참고자료
* [강의 영상](https://www.youtube.com/watch?v=E9NZ0YEZrYU)
* [강의 장표](reference/86_1.pdf)

##### [목차로 이동](#목차)

## 강의 요약
두 번째 참여고 여전히 모르는 점이 많지만 처음에 비해선 나아졌는지 몰두하며 들었다. 대표님의 강의를 듣다 보면, ~~처음 들었을 땐 첫 강의도 잘 못 알아들었지만~~입문하는 개발자들이 놓치기 쉬운 기본, 그리고 한단계 더 나아가기 위한 방향을 다 제시해주는 것 같아서 좋다. 설명도 어려운 듯하지만 듣다 보면 꼭 필요한 개념이구나 싶기도 하고 개념들끼리 연관시켜 설명해주시니 반복해서 들어야겠다는 생각도 든다.

이번엔 코딩과 직접적인 관련 있는 얘긴 아니지만 한 가지 조언이 기억에 남는다.

>

##### [목차로 이동](#목차)

### Value Context vs Identifier Context
인터넷 강의로 들었던 코드스피츠 83의 도입도 이 내용이었다. 내 기억에 [그 강의](https://github.com/nara1030/TIL/blob/master/docs/lecture_list/code_spitz/s83_object1/object1_week1_ch00-ch01.md#Pointer-of-Pointer)가 좀 더 구체적으로 집어줬다면 이번엔 좀 더 포괄적으로 리마인드한다는 느낌으로 진행되었다. 이 개념이 중요한 이유는 [프로그래밍 패러다임](https://github.com/nara1030/ThisIsJava/blob/master/docs/etc/programming_paradigm.md)의 기반이 될 뿐 아니라 프로그램을 짤 때도 어떤 컨택스트를 사용할지가 가장 중요하기 때문이다.

| 조건 | 프로그래밍 패러다임 |
| -- | -- |
| 값(Value) | 함수형 프로그래밍 |
| 식별자(Identifier) | 객체지향 프로그래밍 |

여기서 Context란 관점이다. 코드를 통해 살펴보자.

```javascript
const a = {
	a:3,
	b:5
};
const b = {
	a:3,
	b:5
};

console.log(a === b); // Identifier

console.log(JSON.stringify(a) === JSON.stringify(b)); // Value → 객체지향 비권장 컨택스트
```

이때 값(Primitive)의 여부는 언어의 기본 설정으로 결정되며, 값 비교는 변수가 저장되어 있는 메모리 주소가 달라도 담겨있는 값이 같다면 같다. 바로 이 관점이 Value Context다. 그에 반해 Identifier 기준으로 같다는 것은 어떤 메모리에 있는가가 기준이 된다.

위에서 언급했듯 객체지향은 철저하게 Value Context를 배제하는 관점을 가진다(함수형 프로그래밍이 Value Context 안에 들어있다). 만약 객체지향에서 Value Context를 기반으로 프로그래밍 하는 순간 이미 프로그램은 버그가 확정된거나 다름없다. 즉 객체지향에서는 메서드의 인자, 리턴 등의 전부 값이 아닌 객체만 사용해야 한다. 그럼 객체지향에서 숫자(Primitive)를 받는 경우는 어떻게 해야 될까? 숫자를 받는다는 것 자체가 잘못하고 있는 것이고 각 숫자의 의미(ex. 나이, 돈, 카운트)가 생각해 아래와 같이 받아야 한다.

```java
// 객체지향에서 Primitive(Value)를 받는 예
new Money(1000);
new Age(25);
new Count(10);
```

즉 각 인자(숫자)를 받을 땐 객체를 받아야 한다. 따라서 객체지향에서 값을 쓸 수 있는 유일한 컨택스트는 생성자 인자 뿐이다(`!!`). 정리하면 두 관점의 특징은 아래와 같다.

| Value | Identifier |
| -- | -- |
| 끝없는 복사본 | 하나의 원본 |
| 상태 변화에 안전(하긴 하지...) | 상태 변화를 내부에서 책임(관리) |
| 연산을 기반으로 로직 전개 | 메세지를 기반으로 로직 전개 |

Value Context는 메모리 주소가 중요하지 않기 때문에 a에 있는 3을 참조하나 b에 있는 3을 참조하는 같다. 그 이유는 참조하지 않기 때문이다. 다시 말해 할당하거나 가져올 때 값(value)을 사용한다는 것은 언제나 복사본을 사용한다는 의미다. 만약 우리가 객체를 만들 때 상태가 변할 때마다 새 객체를 토하게 되면 그것도 일종의 Value Context를 따른다고 볼 수 있다. 이와 같이 Value Context는 상태 변화에 안전하지만 상태 관리되어서 안전한 것은 아니고 복사본만 존재하기 때문에 안전하다. 예를 들어 `1 + 3`을 한다면 `1`과 `3`은 그대로 있고 `4`가 생기는 식이다. 그래서 이(value)를 관리하기 위해 함수형 프로그래밍이 등장한다.

한편 Identifier Context는 a 객체의 속성을 바꾸는, 즉 하나의 원본을 사용한다. 이는 다시 말해 값이 Mutable하기 때문에 사용 시 일관성 문제가 생긴다. 따라서 내부 상태에 대해 책임을 지도록 만들어야 한다.

- -

* 주소가 아닌 해시값
	* https://okky.kr/article/611080
* 값 객체
* RxJava

##### [목차로 이동](#목차)

### Polymorphism
Polymorphism, 즉 다형성은 객체지향의 핵심으로 이미 [이전 강의](https://github.com/nara1030/TIL/blob/master/docs/lecture_list/code_spitz/s83_object1/object1_week1_ch00-ch01.md#Polymorphism)에서 언급한 바 있다. 16:15 추가.

```javascript
const Worker = class {
	run() {
		console.log("working");
	}
	print() {
		this.run();
	}
};

const HardWorker = class extends  Worker {
	run() {
		console.log("hardWorking");
	}
}

const worker = new HardWorker();
console.log(worker instanceof Worker); // substitution
worker.print(); // internal identity
```

##### [목차로 이동](#목차)

#### Polymorphism of Prototype


##### [목차로 이동](#목차)
