package lesson4.decortor;

public class DecortorTest {
	public static void main(String args[]) {
		System.out.println("---------初始数据库操作---------");
		// 初始数据库操作
		DbOperator dbOperator = new DbOperator();
		dbOperator.crud();

		System.out.println("---------增加缓存命中功能---------");
		// 增加缓存命中功能
		CacheDecortor cacheDbOperator = new CacheDecortor(dbOperator);
		cacheDbOperator.crud();

		System.out.println("---------增加更新，安全检测判断功能---------");
		// 增加更新，安全检测判断功能
		SecurityCheckDecortor SecurityCheckDbOperator = new SecurityCheckDecortor(dbOperator);
		SecurityCheckDbOperator.crud();

		System.out.println("---------增加以上2种功能---------");
		// 增加以上2种功能
		SecurityCheckDecortor SecurityCheckDbOperator2 = new SecurityCheckDecortor(new CacheDecortor(dbOperator));
		SecurityCheckDbOperator2.crud();
	}
}
