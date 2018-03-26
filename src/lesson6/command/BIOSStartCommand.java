package lesson6.command;

/**
 * �������� -- BIOS��������
 * 
 */
public class BIOSStartCommand implements Command {
	private Computer computer;

	public BIOSStartCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.startBIOS();
	}
}