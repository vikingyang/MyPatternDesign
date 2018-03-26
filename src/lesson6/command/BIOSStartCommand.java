package lesson6.command;

/**
 * ¾ßÌåÃüÁî -- BIOSÆô¶¯ÃüÁî
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