package lesson7.strategy;

public class LoginWeChat implements Strategy {
	@Override
	public void login() {
		System.out.println("Login with WeChat.");
	}
}