package lesson6.chainofresposibility;

public class Client {
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();

		h1.setNextHandler(h2);
		h2.setNextHandler(h3);

		h1.handleRequest(1);
		System.out.println("-----------");
		h1.handleRequest(2);
		System.out.println("-----------");
		h1.handleRequest(3);
	}
}