package lesson5.jdk;

public class ProxyStatic implements SubjectInterface {
	private SubjectInterface subject = null;

	@Override
	public void operate() {
		if (subject == null)
			subject = new RealJdkSubject();
		System.out.print("I'm Proxy, I'm invoking...");
		this.subject.operate();
	}

	public static void main(String[] args) {
		SubjectInterface subject = new ProxyStatic();
		subject.operate();
	}
}