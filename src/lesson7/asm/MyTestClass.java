package lesson7.asm;

public class MyTestClass {
	private String fieldName1;
	private String fieldName2;
	private String fieldName3;

	public MyTestClass() {
		super();
	}

	public String methodName1(int i) {
		return fieldName1 + i;
	}

	public String methodName2(double d) {
		return fieldName2 + d;
	}

	public String methodName3(String str) {
		return fieldName3 + str;
	}
}
