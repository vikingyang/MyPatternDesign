package lesson4.file;

public class TXTFile extends AbstractFile {
	public TXTFile(String name) {
		this.name = name;
	}

	public void showFileName() {
		System.out.println(this.name);
	}
}