package lesson6.chainofresposibility;

class ConcreteHandler2 extends Handler {
	@Override
	public void handleRequest(int req) {
		if (req == 2) {
			System.out.println("������2����������");
		} else {
			System.out.println("������2�ͷ�����");
			this.nextHandler.handleRequest(req);
		}
	}
}