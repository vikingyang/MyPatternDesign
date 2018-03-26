package lesson4.file;

public abstract class AbstractFile {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void showFileName();
}