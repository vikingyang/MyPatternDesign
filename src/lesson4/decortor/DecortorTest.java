package lesson4.decortor;

public class DecortorTest {
	public static void main(String args[]) {
		System.out.println("---------��ʼ���ݿ����---------");
		// ��ʼ���ݿ����
		DbOperator dbOperator = new DbOperator();
		dbOperator.crud();

		System.out.println("---------���ӻ������й���---------");
		// ���ӻ������й���
		CacheDecortor cacheDbOperator = new CacheDecortor(dbOperator);
		cacheDbOperator.crud();

		System.out.println("---------���Ӹ��£���ȫ����жϹ���---------");
		// ���Ӹ��£���ȫ����жϹ���
		SecurityCheckDecortor SecurityCheckDbOperator = new SecurityCheckDecortor(dbOperator);
		SecurityCheckDbOperator.crud();

		System.out.println("---------��������2�ֹ���---------");
		// ��������2�ֹ���
		SecurityCheckDecortor SecurityCheckDbOperator2 = new SecurityCheckDecortor(new CacheDecortor(dbOperator));
		SecurityCheckDbOperator2.crud();
	}
}
