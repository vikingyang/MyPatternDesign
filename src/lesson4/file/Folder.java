package lesson4.file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
	private List<AbstractFile> fileList = new ArrayList<AbstractFile>();

	public Folder(String name) {
		this.name = name;
	}

	public void showFileName() {
		System.out.println(this.name);
	}

	public void addFile(AbstractFile file) {
		fileList.add(file);
	}

	public void displayFiles() {
		for (AbstractFile file : this.fileList) {
			file.showFileName();
		}
	}
}