package lesson6.chainofresposibility;

class ConcreteHandler1 extends Handler {
	@Override
	public void handleRequest(int req) {
		if (req == 1) {
			System.out.println("������1����������");
		} else {
			System.out.println("������1�ͷ�����");
			this.nextHandler.handleRequest(req);
		}
	}
}