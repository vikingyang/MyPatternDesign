package lesson5.gclib;

import java.lang.reflect.Method;

import lesson5.cache.CacheManager;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyCacheCglib implements MethodInterceptor {
	private Object target;

	public Object getInstance(Object target) {
		this.target = target;
		// Cglib中的加强器，用来创建动态代理
		Enhancer enhancer = new Enhancer();
		// 设置要创建动态代理的类
		enhancer.setSuperclass(this.target.getClass());
		// 设置回调，这里相当于是对于代理类上所有方法的调用，都会调用Callback，而Callback则需要实现intercept()方法进行拦截
		enhancer.setCallback(this);
		Object obj = enhancer.create();
		return obj;
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("---------before method invoke---------");
		CacheManager.add("realCglibSubject", target);
		Object object = arg3.invokeSuper(arg0, arg2);
		System.out.println(object);
		System.out.println("---------end method invoke---------");
		return object;
	}
}