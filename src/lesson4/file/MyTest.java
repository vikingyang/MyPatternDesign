package lesson4.file;

public class MyTest {

	public static void main(String[] args) {
		Folder folder = new Folder("һ��Ŀ¼");
		AbstractFile txtFile = new TXTFile("�����ļ�txt");
		AbstractFile aviFile = new AVIFile("�����ļ�avi");
		Folder txtFolder = new Folder("����txtĿ¼");
		Folder aviFolder = new Folder("����aviĿ¼");

		AbstractFile txtFile1 = new TXTFile("�����ļ�txt1");
		AbstractFile txtFile2 = new TXTFile("�����ļ�txt2");
		AbstractFile txtFile3 = new TXTFile("�����ļ�txt3");
		AbstractFile aviFile1 = new AVIFile("�����ļ�avi1");
		AbstractFile aviFile2 = new AVIFile("�����ļ�avi2");

		folder.addFile(txtFile);
		folder.addFile(aviFile);
		folder.addFile(txtFolder);
		folder.addFile(aviFolder);

		txtFolder.addFile(txtFile1);
		txtFolder.addFile(txtFile2);
		txtFolder.addFile(txtFile3);

		aviFolder.addFile(aviFile1);
		aviFolder.addFile(aviFile2);

		System.out.println("һ��Ŀ¼�µ��ļ�:");
		folder.displayFiles();
		System.out.println("\n����txtĿ¼�µ��ļ�:");
		txtFolder.displayFiles();
		System.out.println("\n����aviĿ¼Ŀ¼�µ��ļ�:");
		aviFolder.displayFiles();
	}
}