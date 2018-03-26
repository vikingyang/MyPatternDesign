package lesson3.user;

import lesson3.user.bean.User;

public class UserManagerTest {
	public static void main(String[] args) {
		UserManager.loadCache();

		User user1 = (User) UserManager.getUser("11111111");
		user1.show();

		User user2 = (User) UserManager.getUser("22222222");
		user2.show();

		User user3 = (User) UserManager.getUser("33333333");
		user3.show();
	}
}