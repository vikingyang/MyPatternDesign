package lesson7.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		//login with QQ
		Context context = new Context(new LoginQQ());
		context.executeStrategy();

		//login with WeChat
		context = new Context(new LoginWeChat());
		context.executeStrategy();

		//login with username and password
		context = new Context(new LoginUserNamePassword());
		context.executeStrategy();
	}
}