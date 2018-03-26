package lesson6.command;

/**
 * ¾ßÌåÃüÁî -- OSÆô¶¯ÃüÁî
 */
public class OSStartCommand implements Command {
	private Computer computer;

	public OSStartCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.startOS();
	}
}