package lesson7.strategy;

public class LoginUserNamePassword implements Strategy {
	@Override
	public void login() {
		System.out.println("Login with username and password.");
	}
}