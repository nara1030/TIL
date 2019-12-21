8주차 - State Pattern & Proxy Pattern
=======
2019.12.21: 상태 패턴 및 프록시 패턴  
추후 수정 및 추가
- - - -
## 목차
1. [상태 패턴](#상태-패턴)
2. [프록시 패턴](#프록시-패턴)
3. [참고](#참고)

## 상태 패턴


##### [목차로 이동](#목차)

## 프록시 패턴


```java
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class First {
	public static void main(String[] args) {
		Inter inter = (Inter) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), 
				new Class<?>[] {Inter.class}, 
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("hello");
						
						return method.invoke(new Inter() {
							@Override
							public String toMessage() {
								return "world";
							}
						}, args);
					}
				});
		System.out.println(inter.toMessage());
	}
}

interface Inter {
	String toMessage();
}
```

##### [목차로 이동](#목차)

## 참고


##### [목차로 이동](#목차)