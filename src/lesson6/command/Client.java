package lesson6.command;

/**
 * ����
 */
public class Client {
	public static void main(String[] args) {
		// ����������
		Computer computer = new Computer();
		// ������������趨���Ľ�����
		Command bios_command = new BIOSStartCommand(computer);
		// ������������趨���Ľ�����
		Command mbr_command = new MBRStartCommand(computer);
		// ������������趨���Ľ�����
		Command hdd_command = new HDDStartCommand(computer);
		// ������������趨���Ľ�����
		Command os_command = new OSStartCommand(computer);
		// ������ƶ���Invoker�����������ͨ�����췽�����ý�ȥ
		MacroCommand invoker = new ComputerMacroCommand();
		invoker.addCommand(bios_command);
		invoker.addCommand(mbr_command);
		invoker.addCommand(hdd_command);
		invoker.addCommand(os_command);

		System.out.println("���ʼ����ʼ��������...");

		invoker.execute();

		System.out.println("������ɣ�����������ɣ�����");
	}
}