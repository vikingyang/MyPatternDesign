package lesson3.deepclone;

import java.util.ArrayList;
import java.util.Arrays;

public class ResumeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("-----------------initial object------------------");
		Resume resume = new Resume();
		resume.setName("zhangsan");
		resume.setIntroduce("i love java.");
		resume.setAge(10);
		ArrayList<String> phoneList = new ArrayList<String>(Arrays.asList("13600136000", "13700137000"));
		resume.setPhoneList(phoneList);
		resume.printOut();

		System.out.println("-----------------clone object------------------");
		// clone Object
		Resume resClone = (Resume) resume.clone();
		resClone.printOut();

		System.out.println("-----------------compare the initial and clone object------------------");
		System.out.println("Value: " + resume.equals(resClone));
		System.out.println("Class: " + resume.getClass().equals(resClone.getClass()));

		System.out.println("\n-----------------update object------------------");
		resume.setName("lisi");
		resume.setIntroduce("i love python.");
		resume.setAge(13);
		ArrayList<String> phoneList2 = new ArrayList<String>(Arrays.asList("13800138000", "13900139000"));
		resume.setPhoneList(phoneList2);
		resume.printOut();

		System.out.println("-----------------check clone object------------------");
		resClone.printOut();

		System.out.println("-----------------compare the initial and clone object------------------");
		System.out.println("Value: " + resume.equals(resClone));
		System.out.println("Class: " + resume.getClass().equals(resClone.getClass()));
	}

}
