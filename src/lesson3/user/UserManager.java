package lesson3.user;

import java.util.Hashtable;

import lesson3.user.bean.Admin;
import lesson3.user.bean.Guest;
import lesson3.user.bean.Member;
import lesson3.user.bean.User;

public class UserManager {
	
	private static Hashtable<String, User> userMap = new Hashtable<String, User>();

	public static User getUser(String UserId) {
		User cachedUser = userMap.get(UserId);
		return (User) cachedUser.clone();
	}

	// 对user进行数据库查询，并创建该用户.假设，用户有3种角色: 管理员，游客，会员。
	// userMap.put(userKey, User);
	public static void loadCache() {
		User admin = new Admin();
		admin.setUserId("11111111");
		admin.setUserName("zhangsan");
		userMap.put(admin.getUserId(), admin);

		User guest = new Guest();
		guest.setUserId("22222222");
		guest.setUserName("lisi");
		userMap.put(guest.getUserId(), guest);

		User member = new Member();
		member.setUserId("33333333");
		member.setUserName("wangwu");
		userMap.put(member.getUserId(), member);
	}
}
