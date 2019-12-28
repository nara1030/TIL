8주차 - Composite Pattern
=======
2019.11.30: 컴포지트 패턴  
추후 수정 및 추가
- - - -
## 목차
1. [컴포지트 패턴](#컴포지트-패턴)
2. [기타](#기타)
3. [참고](#참고)

## 컴포지트 패턴


##### [목차로 이동](#목차)

## 기타
스터디원 중 한 분이 메서드 리턴이 boolean인 경우(CompositeIterator의 재귀 부분에 대한 리팩토링)에 대한 리팩토링을 진행한 코드를 올려주셨는데 참고. 추후 생각.

* 기존  
	```java
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
	```
* 리팩토링 이후  
	```java
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		}
		
		Iterator iterator = (Iterator) stack.peek();
		if(!iterator.hasNext()) {
			stack.pop();
			return hasNext();
		}
		return true;
	}
	```

##### [목차로 이동](#목차)

## 참고


##### [목차로 이동](#목차)