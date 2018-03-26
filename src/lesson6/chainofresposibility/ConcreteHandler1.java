package lesson6.chainofresposibility;

class ConcreteHandler1 extends Handler {
	@Override
	public void handleRequest(int req) {
		if (req == 1) {
			System.out.println("处理器1来处理请求");
		} else {
			System.out.println("处理器1释放请求");
			this.nextHandler.handleRequest(req);
		}
	}
}