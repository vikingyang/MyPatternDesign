package lesson5.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import lesson5.cache.CacheManager;

public class ProxyCacheHandler implements InvocationHandler {
	Object obj = null;

	public Object newProxyInstance(Object realObj) {
		this.obj = realObj;
		Class<?> classType = this.obj.getClass();
		return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("---------before method invoke---------");
		CacheManager.add("realJdkSubject", obj);
		method.invoke(obj, args);
		System.out.println("---------end method invoke---------");
		return null;
	}
}