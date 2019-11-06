3주차 - Decorator Pattern
=======
2019.10.12: 데코레이터 패턴, ~~팩토리 패턴~~  
러시아에 있었던 터라 참여 못함
- - - -
## 목차
1. [데코레이터 패턴](#데코레이터-패턴)
2. [전달과 위임](#전달과-위임)
	* [공통점과 차이점](#공통점과-차이점)
	* [예시](#예시)
3. [참고](#참고)
	
## 데코레이터 패턴


##### [목차로 이동](#목차)

## 전달과 위임
이 부분은 LickKing님의 의견을 토대로 적는다.

[전달](https://en.wikipedia.org/wiki/Forwarding_(object-oriented_programming))(`forwarding`)과 [위임](https://en.wikipedia.org/wiki/Delegation_(object-oriented_programming))(`delegation`)은 매우 유사하지만 정확하게 표현하면 다르다.

### 공통점과 차이점
둘 다 겉 객체(오늘 공부한 내용에서는 decorator 객체)가 요청을 받고, 그 요청을 내부 객체를 호출해서 처리한다는 점에서는 같다.

다만 forwarding은 데코레이터 패턴처럼 단순히 요청을 다시 내부 객체에 전달하는 걸 의미하고, delegation은 현재 자신의 컨텍스트(`this`)를 전달한다는 점에서 forwarding가 차이가 있다.

-----
> .

##### [목차로 이동](#목차)

### 예시
자바에서 `this`를 전달해서 delegation을 구현하는 방법은 다음 두 가지다.

> * 상속 이용
> * 명시적으로 `this`를 인자로 보냄



##### [목차로 이동](#목차)

## 참고
* [Decorator Pattern - LichKing](https://multifrontgarden.tistory.com/259?category=471239)
* Delegation vs Forwarding
	* [스터디 토의](https://github.com/LichKing-lee/designpattern/issues/3)
	* [Delegation - 위키](https://en.wikipedia.org/wiki/Forwarding_(object-oriented_programming))
	* [Forwarding - 위키](https://en.wikipedia.org/wiki/Forwarding_(object-oriented_programming))

##### [목차로 이동](#목차)