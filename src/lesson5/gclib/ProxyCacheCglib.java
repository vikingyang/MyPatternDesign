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
		// Cglib�еļ�ǿ��������������̬����
		Enhancer enhancer = new Enhancer();
		// ����Ҫ������̬�������
		enhancer.setSuperclass(this.target.getClass());
		// ���ûص��������൱���Ƕ��ڴ����������з����ĵ��ã��������Callback����Callback����Ҫʵ��intercept()������������
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