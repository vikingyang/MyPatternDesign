package lesson6.command;

/**
 * �������� -- OS��������
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