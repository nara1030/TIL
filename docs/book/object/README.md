오브젝트
=====
조영호 개발자님의 오브젝트를 공부해 기록하고 조금씩 업데이트해본다.  
책만 읽기에는 부담스러웠던 찰나, 코드스피츠에서 이 책을 교재로 [강의](https://codespitz.com/s84/list.php?fbclid=IwAR1W2Mvvt2grbKgvB4wNMOIesodzp7qdztcqtlOwn3Ugj7Iwk0ARgEBz8bk)를 진행해 신청하고 기록한다.  
책의 [예제 코드](https://github.com/eternity-oop/object)(자바 8)도 확인할 수 있다.
- - -
## 목차
1. [소개](#소개)
2. [요약](#요약)
3. [강의](#강의)

## 소개
객체지향 언어인 자바를 자바답게 사용하는 법을 알려준다. 자바를 배우고 나서 if문, for문만 갖고 코딩한다면 그 언어를 제대로 이해하고 있지 않은 것이다. 저자는 1장에서 `패러다임`이라는 개념을 소개함으로써 언어마다 그 언어가 가진 사고방식(ex. 절차지향, 객체지향, 함수형)이 다르며 객체지향적 코딩이 어떤 것인지 예와 함께 설명한다.

* 동영상
	* [의존성을 이용해 설계 진화시키기 by 조영호](https://www.youtube.com/watch?v=dJ5C4qRqAgA)
	* [코드스피츠 강의](https://www.youtube.com/watch?v=sWyZUzQW3IM&t=8s)
* 관련 자료
	* [PPT by 조영호](https://www.slideshare.net/baejjae93?utm_campaign=profiletracking&utm_medium=sssite&utm_source=ssslideview)
	* [객체지향 프로그래밍 입문 by cheese10yun](https://github.com/cheese10yun/TIL/blob/master/OOP/객체-지향-프로그래밍-입문.md)

##### [목차로 이동](#목차)
	
## 요약
* [00_프로그래밍 패러다임](object_summary_00.md)
* [01_객체, 설계](object_summary_01.md)
* [02_객체지향 프로그래밍](object_summary_02.md)
* [03_역할, 책임, 협력](object_summary_03.md)
* [04_설계 품질과 트레이드오프](object_summary_04.md)
* [05_책임 할당하기](object_summary_05.md)
* [06_메시지와 인터페이스](object_summary_06.md)
* [07_객체 분해](object_summary_07.md)
* [08_의존성 관리하기](object_summary_08.md)
* [09_유연한 설계](object_summary_09.md)
* [10_상속과 코드 재사용](object_summary_10.md)
* [11_합성과 유연한 설계](object_summary_11.md)
* [12_다형성](object_summary_12.md)
* [13_서브클래싱과 서브타이핑](object_summary_13.md)
* [14_일관성 있는 협력](object_summary_14.md)
* [15_디자인 패턴과 프레임워크](object_summary_15.md)

##### [목차로 이동](#목차)

## 강의
아래에 코드스피츠에서 조영호님의 오브젝트 책을 교재로 강의한 내용을 기록한다. [본 강의](https://www.bsidesoft.com/8121?fbclid=IwAR1l1EZNkGZqZilTBJtE0eTgJNeIJsXkEOdHMzUwdOknLQP_Wx7L98PExCU)는 오브젝트 11장부터 다루고 있는데, 처음부터 다루지 않아 약간 부담스러웠지만 시간적 여유가 나서 첫 수업을 들어본 바 매우 만족스러웠다. 개발자로 누군가를 가르칠 수 있으려면 어느 정도 수준이 되어야 한다는 [글](https://docs.google.com/document/d/1_phA5XUszSmN7Ta-QHs4DxRz9_iu8YlhxpVjSGEbWcg/edit)을 본 적 있는데, 여기서 최상위에 있는 개발자가 숲과 나무를 동시에 짚어주는 듯한 느낌이었다.

한편 강의 소개엔 객체지향 설계방법론과 기저를 이루는 이론을 공부하기에 안성 맞춤이라 이 책을 기반으로 6주간 스터디를 진행한다고 되어 있다. 이게 무슨 말인지, 좀 더 풀어 페북에서 아래와 같이 얘기했다.

> 코드스피츠84에서 오브젝트 2편을 하는 이유는 책의 뒷부분이 남아서는 아닙니다. 이 책은 사실 11장을 기준으로 절반을 쪼개도 될 정도로 내용이 구분됩니다.  

> * 앞부분: 전반적인 객체지향적 사고를 기를 수 있게 SOLID를 비롯한 설계원칙을 코드로 풀면서 점진적으로 책임기반 문제해결방법 다룸  
> * 뒷부분: 객체지향 언어가 실제로 어떤 구체적인 방법을 통해 그러한 설계를 뒷받침하는가에 대한, 매커니즘 기반의 설명  

> 즉, 두괄식으로 구성된 책이라 할 수 있고, 테마가 달라 오브젝트 2편을 하게 되었습니다.  

강의 소개는 이로 갈음하고, 요약 정리는 아래 목차에서 확인 가능하다.

* 목차
	* 오브젝트_전반부
		* [1주차 - 프로그래밍 패러다임 & 객체, 설계](../../lecture_list/code_spitz/s83_object1/object1_week1_ch00-ch01.md)
		* 9장_유연한 설계
		* [10장_상속과 코드 재사용](../../lecture_list/code_spitz/s83_object1/object1_ch10.md)
	* [오브젝트_후반부](https://codespitz.com/s84/list.php?fbclid=IwAR0EtyO3oufqcMr5Ryc9bvP6N72WFbPTGE0u2YV9rk7RW5tjSZKbiy6P_Aw)
		* [1주차 - 합성과 유연한 설계](../../lecture_list/code_spitz/s84_object2/object2_week1_ch11.md)
		* [2주차 - 서브클래싱과 서브타이핑](../../lecture_list/code_spitz/s84_object2/object2_week2_ch13.md)
		* [3주차 - 일관성 있는 협력](../../lecture_list/code_spitz/s84_object2/object2_week3_ch14.md)
		* [4주차 - 디자인 패턴과 프레임워크(`컴포지트 & 비지터`)](../../lecture_list/code_spitz/s84_object2/object2_week4_ch15_composite_visitor.md)
		* [5주차 - 디자인 패턴과 프레임워크(`커맨드`)](../../lecture_list/code_spitz/s84_object2/object2_week5_ch15_command.md)
		* [6주차 - 테스트 주도 개발](../../lecture_list/code_spitz/s84_object2/object2_week6.md)
		
##### [목차로 이동](#목차)