package lesson4.file;

public class AVIFile extends AbstractFile {
	public AVIFile(String name) {
		this.name = name;
	}

	public void showFileName() {
		System.out.println(this.name);
	}
}