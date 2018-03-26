package lesson6.command;

/**
 * ¾ßÌåÃüÁî -- HDDÆô¶¯ÃüÁî
 */
public class HDDStartCommand implements Command {
	private Computer computer;

	public HDDStartCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.startHDD();
	}
}