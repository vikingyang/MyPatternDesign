package lesson6.command;

/**
 * 测试
 */
public class Client {
	public static void main(String[] args) {
		// 创建接收者
		Computer computer = new Computer();
		// 创建命令对象，设定它的接收者
		Command bios_command = new BIOSStartCommand(computer);
		// 创建命令对象，设定它的接收者
		Command mbr_command = new MBRStartCommand(computer);
		// 创建命令对象，设定它的接收者
		Command hdd_command = new HDDStartCommand(computer);
		// 创建命令对象，设定它的接收者
		Command os_command = new OSStartCommand(computer);
		// 命令控制对象Invoker，把命令对象通过构造方法设置进去
		MacroCommand invoker = new ComputerMacroCommand();
		invoker.addCommand(bios_command);
		invoker.addCommand(mbr_command);
		invoker.addCommand(hdd_command);
		invoker.addCommand(os_command);

		System.out.println("命令开始：开始启动电脑...");

		invoker.execute();

		System.out.println("命令完成：电脑启动完成！！！");
	}
}