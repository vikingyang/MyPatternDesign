package lesson6.chainofresposibility;

class ConcreteHandler2 extends Handler {
	@Override
	public void handleRequest(int req) {
		if (req == 2) {
			System.out.println("处理器2来处理请求");
		} else {
			System.out.println("处理器2释放请求");
			this.nextHandler.handleRequest(req);
		}
	}
}