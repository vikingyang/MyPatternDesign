package lesson3.deepclone;

import java.util.ArrayList;
import java.util.List;

public class Resume implements Cloneable {
	private String name;
	private String introduce;
	private int age;
	private List<String> phoneList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}

	// clone Object
	public Object clone() throws CloneNotSupportedException {
		Resume resClone = (Resume) super.clone();
		resClone.setName(new String(this.name));
		resClone.setIntroduce(new String(this.introduce));
		resClone.setAge(this.age);
		List<String> newPhoneList = new ArrayList<String>();
		for (String phone : resClone.getPhoneList()) {
			newPhoneList.add(phone);
		}
		resClone.setPhoneList(newPhoneList);

		return resClone;
	}

	public void printOut() {
		StringBuffer sb = new StringBuffer();
		sb.append("name: " + this.getName() + "\n");
		sb.append("introduce: " + this.getIntroduce() + "\n");
		sb.append("age: " + this.getAge() + "\n");
		sb.append("phoneList: " + this.getPhoneList().toString());
		System.out.println(sb.toString());
	}

}
