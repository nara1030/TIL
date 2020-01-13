[CodeSpitz86] 객체지향 자바스크립트
=====
* 일시: 2020.01.08(수), 20:00 ~ 22:00
* 장소: 홍대입구역 한빛미디어 강의장
- - -
## 목차
1. [참고자료](#참고자료)
2. [강의 요약](#강의-요약)
	* [Value Context vs Identifier Context](#Value-Context-vs-Identifier-Context)
	* Polymorphism
		* Polymorphism of Prototype
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
두 번째 참여고 여전히 모르는 점이 많지만 처음에 비해선 나아졌는지 몰두하며 들었다. 대표님의 강의를 듣다 보면, ~~처음 들었을 땐 첫 강의도 잘 못 알아들었지만~~입문하는 개발자들이 놓치기 쉬운 기본, 그리고 한단계 더 나아가기 위한 방향을 다 제시해주는 것 같아서 좋다. 설명도 어려운 듯하지만 듣다 보면 꼭 필요한 개념이구나 싶기도 하고 개념들끼리 연관시켜 설명해주시니 반복해서 들어야겠다는 생각~~만 하곤 말지만~~도 든다. ~~듣다보면 입시강사처럼 강의하시는 듯한 느낌도 받는다(지식의 우선순위를 알려준다는 점에서).~~

이번엔 코딩과 직접적인 관련 있는 얘긴 아니지만 한 가지 조언이 기억에 남는다.

>

##### [목차로 이동](#목차)

### Value Context vs Identifier Context
인터넷 강의로 들었던 코드스피츠 83의 도입도 이 내용이었다. 내 기억에 [그 강의](https://github.com/nara1030/TIL/blob/master/docs/lecture_list/code_spitz/s83_object1/object1_week1_ch00-ch01.md#Pointer-of-Pointer)가 좀 더 구체적으로 집어줬다면 이번엔 좀 더 포괄적으로 리마인드한다는 느낌으로 진행되었다. 이 개념이 중요한 이유는 [프로그래밍 패러다임](https://github.com/nara1030/ThisIsJava/blob/master/docs/etc/programming_paradigm.md)의 기반이 되기 때문이다.

| 조건 | 프로그래밍 패러다임 |
| -- | -- |
| 값(Value) | 함수형 프로그래밍 |
| 식별자(Identifier) | 객체지향 프로그래밍 |

참고로 여기서 Context란. 이제 구체적으로 코드를 통해 살펴보자.

주소가 아닌 해시값. 강의 올라오는대로 추후 추가.

##### [목차로 이동](#목차)

