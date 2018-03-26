package lesson7.strategy;

public class LoginQQ implements Strategy {
	@Override
	public void login() {
		System.out.println("Login with QQ.");
	}
}