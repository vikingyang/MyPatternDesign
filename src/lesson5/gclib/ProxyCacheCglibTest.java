package lesson5.gclib;

import lesson5.cache.CacheManager;

public class ProxyCacheCglibTest {
	public static void main(String[] args) {
		ProxyCacheCglib proxy = new ProxyCacheCglib();
		RealCglibSubject cglib = (RealCglibSubject) proxy.getInstance(new RealCglibSubject());
		cglib.operate();
		
		//验证缓存中存入对象
		System.out.println("---------validate the Cache:---------");
		RealCglibSubject realSubject = (RealCglibSubject) CacheManager.get("realCglibSubject");
		System.out.println(realSubject.operate());
		
	}
}
