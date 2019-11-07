3주차 - Decorator Pattern
=======
2019.10.12: 데코레이터 패턴, ~~팩토리 패턴~~  
러시아에 있었던 터라 참여 못함  
링크드 리스트와 관련 개념이라 어렴풋이 생각만 했었는데, 전달/위임이라는 중요한 포인트를 들었고 짚고 넘어갈 필요성을 느낌
- - - -
## 목차
1. [데코레이터 패턴](#데코레이터-패턴)
2. [전달과 위임](#전달과-위임)
	* [Forwarding](#Forwarding)
		* [정의](#정의)
		* [예시](#예시)
		* [응용](#응용)
	* [Delegation](#Delegation)
		* [정의](#정의)
		* [예시](#예시)
		* [응용](#응용)
	* [스터디 언급](#스터디-언급)
3. [참고](#참고)
	
## 데코레이터 패턴


##### [목차로 이동](#목차)

## 전달과 위임
한 번에 이해가 잘 안 되는데, 이해하는대로 수정해나갈 예정이다.

### Forwarding
#### 정의
> In object-oriented programming, **forwarding** means that using a member of an object(either a property or a method) results in actually using the corresponding member of a different object, notably in the context of the receiving object.

##### [목차로 이동](#목차)

#### 예시

##### [목차로 이동](#목차)

#### 응용
* 직접 적용
	* Chain-of-responsibility pattern
	* Decorator pattern
	* Proxy pattern
* 간접 적용
	* Adapter pattern
	* Bridge pattern
	* Facade pattern

##### [목차로 이동](#목차)

### Delegation
#### 정의
> In object-orient programming, **delegation** refers to evaluating a member(property or method) of one object(the receiver) in the context of another original object(the sender).

~~Forwarding과 비교해 차이점이 아직 이해 안 가서 이 부분은 추후 작성한다.~~ 

**위키**에 위임(`Delegation`)을 하기 위한 방법으로 명시적(`explicitly`), 암묵적(`implicitly`) 두 가지가 언급되어 있다. 이때 암묵적 방법으로 상속이 언급되는데, **GeeksforGeeks**에서 위임과 상속을 비교한다. 따라서 상속은 위임과 같은 효과를 내지만 구분할 필요가 있는 것으로 이해한다. 아래 위임과 상속을 비교한 내용을 일부 발췌한다.

* `Delegation` can be an alternative to `inheritance`.
* The primary advantage of `delegation` is run-time flexibility - the delegate can easily be changed at run-time. But unlike `inheritance`, delegation is not directly supported by most popular object-oriented languages, and it doesn't facilitate [dynamic polymorphism](https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/).

##### [목차로 이동](#목차)

#### 예시
* Delegation  
	```java
	class RealPrinter {
		// the "delegate"
		void print() {
			System.out.println("The Delegate");
		}
	}
	
	class Printer {
		// the "delegator"
		RealPrinter p = new RealPrinter();
		
		void print() {
			p.print();	// delegation
		}
	}
	
	public class Tester {
		public static void main(String[] args){
			Printer printer = new Printer();
			printer.print();
		}
	}
	```
	* To the outside world, it looks like Printer actually prints.
	* Output: `The Delegate`
* Inheritance  
	```java
	class RealPrinter {
		void print() {
			System.out.println("Printing Data");
		}
	}
	
	class Printer extends RealPrinter {
		void print() {
			super.print();
		}
	}
	
	public class Tester {
		public static void main(String[] args) {
			Printer printer = new Printer();
			printer.print();
		}
	}
	```
	* To the outside world, it looks like Printer actually prints.
	* Output: `Printing Data`

-----
`Delegation`의 예를 보며 `Composition`이 떠올랐는데 GeeksforGeeks에 **언제 상속 혹은 위임을 사용해야 하는지** 언급된 부분이 있어서 발췌해본다.

* You want to express relationship(is-a) then you want to use Inheritance.
* You want to able to pass your class to an existing API expecting A's then you need to use `inheritance`.
* You want to enhance A, but A is final and can no further be sub-classed then you need to use `composition` and `delegation`.
	
##### [목차로 이동](#목차)

#### 응용
* 관련 내용
	* Wiki
	
##### [목차로 이동](#목차)

### 스터디 언급
이 부분은 LickKing님의 의견을 토대로 적는다. 

전달(`forwarding`)과 위임(`delegation`)은 매우 유사하지만 정확하게 표현하면 다르다. 

> * 둘 다 겉 객체(오늘 공부한 내용에서는 decorator 객체)가 요청을 받고, 그 요청을 내부 객체를 호출해서 처리한다는 점에서는 같다.
> * 다만 forwarding은 데코레이터 패턴처럼 단순히 요청을 다시 내부 객체에 전달하는 걸 의미하고, delegation은 현재 자신의 컨텍스트(`this`)를 전달한다는 점에서 forwarding가 차이가 있다.

* [참고 후 추후 정리](https://github.com/LichKing-lee/designpattern/issues/3)

##### [목차로 이동](#목차)

## 참고
* [Decorator Pattern - LichKing](https://multifrontgarden.tistory.com/259?category=471239)
* Delegation vs Forwarding in Java
	* [Delegation vs Inheritance in Java - GeeksforGeeks](https://www.geeksforgeeks.org/delegation-vs-inheritance-java/)
	* [Forwarding(object-orient programming) - 위키백과](https://en.wikipedia.org/wiki/Forwarding_(object-oriented_programming))
	* [Delegation(object-orient programming) - 위키백과](https://en.wikipedia.org/wiki/Delegation_(object-oriented_programming))
	* [Delegate vs Forwarding in Java OOP - StackExchange](https://softwareengineering.stackexchange.com/questions/399361/delegate-vs-forwarding-in-java-oop)
	* [OOP: Delegation & Forwarding](http://codility.kamol.org/oop/2015/03/22/Delegating-Forwarding/)
	
##### [목차로 이동](#목차)