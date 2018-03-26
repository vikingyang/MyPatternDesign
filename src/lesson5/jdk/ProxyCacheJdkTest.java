package lesson5.jdk;

import lesson5.cache.CacheManager;

public class ProxyCacheJdkTest {
	public static void main(String[] args) {
		SubjectInterface subject = (SubjectInterface) new ProxyCacheHandler().newProxyInstance(new RealJdkSubject());
		subject.operate();

		//��֤�����д������
		System.out.println("---------validate the Cache:---------");
		RealJdkSubject realSubject = (RealJdkSubject) CacheManager.get("realJdkSubject");
		realSubject.operate();
	}
}