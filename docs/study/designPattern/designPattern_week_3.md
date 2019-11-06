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

* [Forwarding(object-orient programming) - 위키백과](https://en.wikipedia.org/wiki/Forwarding_(object-oriented_programming))
* [Delegation(object-orient programming) - 위키백과](https://en.wikipedia.org/wiki/Delegation_(object-oriented_programming))

### Forwarding
#### 정의

##### [목차로 이동](#목차)

#### 예시

##### [목차로 이동](#목차)

#### 응용

##### [목차로 이동](#목차)

### Delegation
#### 정의

##### [목차로 이동](#목차)

#### 예시

##### [목차로 이동](#목차)

#### 응용

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

##### [목차로 이동](#목차)