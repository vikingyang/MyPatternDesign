package lesson5.cache;

import java.util.Date;
import java.util.Hashtable;

public class CacheManager {

	private static Hashtable<String, Object> cacheTable = new Hashtable<String, Object>();

	public CacheManager() {
	}

	// ���cache,������
	public synchronized static void add(String key, Object value) {
		CacheManager.add(key, value, -1);
	}

	// ���cache�й���ʱ��
	public synchronized static void add(String key, Object value, long timeOut) {
		CacheManager.add(key, value, timeOut, null);
	}

	// ���cache�й���ʱ�䲢�Ҿ��лص�����
	public synchronized static void add(String key, Object value, long timeOut, ICacheMethod callback) {
		if (timeOut > 0) {
			timeOut += new Date().getTime();
		}
		CacheItem item = new CacheItem(key, value, timeOut, callback);
		CacheManager.cacheTable.put(key, item);
	}

	// ��ȡcache
	public synchronized static Object get(String key) {
		Object obj = CacheManager.cacheTable.get(key);
		if (obj == null) {
			return null;
		}
		CacheItem item = (CacheItem) obj;
		boolean expired = CacheManager.cacheExpired(key);
		if (expired == true) // �ѹ���
		{
			if (item.getCallback() == null) {
				CacheManager.remove(key);
				return null;
			} else {
				ICacheMethod callback = item.getCallback();
				callback.execute(key);
				expired = CacheManager.cacheExpired(key);
				if (expired == true) {
					CacheManager.remove(key);
					return null;
				}
			}
		}
		return item.getValue();
	}

	// �Ƴ�cache
	public synchronized static void remove(String key) {
		Object obj = CacheManager.cacheTable.get(key);
		if (obj != null) {
			obj = null;
		}
		CacheManager.cacheTable.remove(key);
	}

	// ��������cache����
	public synchronized static void clear() {
		for (String s : CacheManager.cacheTable.keySet()) {
			CacheManager.cacheTable.put(s, null);
		}
		CacheManager.cacheTable.clear();
	}

	// �ж��Ƿ����
	private static boolean cacheExpired(String key) {
		CacheItem item = (CacheItem) CacheManager.cacheTable.get(key);
		if (item == null) {
			return false;
		}
		long milisNow = new Date().getTime();
		long milisExpire = item.getTimeOut();
		if (milisExpire <= 0) { // ������
			return false;
		} else if (milisNow >= milisExpire) {
			return true;
		} else {
			return false;
		}
	}

	// ��ӡCache�����ж���
	public static void showAllCache() {
		Hashtable<String, Object> cacheTable = CacheManager.cacheTable;
		for (String key : cacheTable.keySet()) {
			System.out.println("key:"+ key+", value:"+ cacheTable.get(key) );
		}
	}
}