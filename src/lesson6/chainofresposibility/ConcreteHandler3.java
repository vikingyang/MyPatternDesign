package lesson6.chainofresposibility;

class ConcreteHandler3 extends Handler {
	@Override
	public void handleRequest(int req) {
		if (req == 3) {
			System.out.println("������3����������");
		} else {
			System.out.println("������3�ͷ�����");
			this.nextHandler.handleRequest(req);
		}
	}
}