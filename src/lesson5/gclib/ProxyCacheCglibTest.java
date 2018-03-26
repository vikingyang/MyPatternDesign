package lesson5.gclib;

import lesson5.cache.CacheManager;

public class ProxyCacheCglibTest {
	public static void main(String[] args) {
		ProxyCacheCglib proxy = new ProxyCacheCglib();
		RealCglibSubject cglib = (RealCglibSubject) proxy.getInstance(new RealCglibSubject());
		cglib.operate();
		
		//��֤�����д������
		System.out.println("---------validate the Cache:---------");
		RealCglibSubject realSubject = (RealCglibSubject) CacheManager.get("realCglibSubject");
		System.out.println(realSubject.operate());
		
	}
}
