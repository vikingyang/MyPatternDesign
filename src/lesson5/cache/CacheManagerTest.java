package lesson5.cache;

import java.util.Arrays;
import java.util.List;

class CacheManagerTest {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("1", "2");
		List<String> list2 = Arrays.asList("11", "22");
		List<String> list3 = Arrays.asList("111", "222");
		List<String> list4 = Arrays.asList("1111", "2222");

		CacheManager.add("111", list1);
		CacheManager.add("222", list2);
		CacheManager.add("333", list3);
		CacheManager.add("444", list4);


		List<String> list = (List<String>)CacheManager.get("333");
		System.out.println(list.get(0));

		CacheManager.showAllCache();
	}
}