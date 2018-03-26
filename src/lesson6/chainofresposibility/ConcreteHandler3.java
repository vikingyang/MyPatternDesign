package lesson6.chainofresposibility;

class ConcreteHandler3 extends Handler {
	@Override
	public void handleRequest(int req) {
		if (req == 3) {
			System.out.println("处理器3来处理请求");
		} else {
			System.out.println("处理器3释放请求");
			this.nextHandler.handleRequest(req);
		}
	}
}