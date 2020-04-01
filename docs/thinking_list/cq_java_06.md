배열과 문자열의 차이점에 대해 말해보세요.
=====
* 최초생성일: 2020.04.01
* 최종수정일: 2020.04.01
- - -
## 목차
1. [개요](#개요)
	* [배열](#배열)
	* [문자열](#문자열)
2. [관련](#관련)
3. 알고리즘
4. [참고](#참고)

## 개요
### 배열
* 어떤 메모리 블록에 연속적으로 나열된 같은 유형의 변수 모음
* 연결 리스트와 마찬가지로 선형적으로 저장하는 방식이지만 특징 다름(인덱스 존재)
* 동적인 자료 구조 아님
	* 크기의 일부만 사용 시에도 배열에 있는 모든 원소에 대해 메모리가 할당되어야 함
	* 현대적 언어에서는 언어 자체에서 동적 배열 지원(내부적으로는 정적 배열 사용)  
		```javascript
		// 자바스크립트에서 배열은 Array 객체의 인스턴스
		// 동적 크기 조정
		Array cities =  new Array();
		cities[0] = "New York";
		cities[1] = "Los Angeles";
		```

아래는 자바의 배열에 관한 부분이다.

* 자바 배열에 저장되는 데이터 유형과는 별개의 객체로(?) 정의되어 있음
	* ∴ 배열에 대한 레퍼런스와 배열의 원소에 대한 레퍼런스가 다름
	* C와 마찬가지로 단순한 대입만으로 배열 원소를 복사할 수 없음(??)
* 자바 배열은 정적임

아래 참고부터 읽기.

##### [목차로 이동](#목차)

### 문자열
* 문자들이 연속적으로 나열되어 있는 것
* 사용하는 언어와 애플리케이션이 실행되는 운영체제의 설정에 따라 문자가 어떻게 구성되는지 달라짐
	* 문자열에 들어가는 각 글자가 각각 한 바이트씩 표현된다고 생각하는 시대 지남
* 인코딩... p169

##### [목차로 이동](#목차)

## 관련


##### [목차로 이동](#목차)

## 참고
* [How do I declare and initialize and array in Java?](https://stackoverflow.com/questions/1200621/how-do-i-declare-and-initialize-an-array-in-java)
* Immutable array
	* [Immutable array in Java](https://stackoverflow.com/questions/3700971/immutable-array-in-java)
	* [How to make elements of array immutable in Java?](https://www.tutorialspoint.com/how-to-make-elements-of-array-immutable-in-java)
	* [Immutable ArrayList in Java](https://www.baeldung.com/java-immutable-list)
* 특별한 배열: [Java String Array](https://www.journaldev.com/17809/java-string-array)
	* [Difference between String and Character array in Java](https://www.geeksforgeeks.org/difference-between-string-and-character-array-in-java/)
	* [Difference between Array and String](http://www.differencebetween.net/technology/difference-between-array-and-string/)
* [Why is String immutable in Java?](https://stackoverflow.com/questions/22397861/why-is-string-immutable-in-java)
* [배열보다는 리스트를 사용하라](https://madplay.github.io/post/prefer-lists-to-arrays)
* String, StringBuilder, StringBuffer

##### [목차로 이동](#목차)
