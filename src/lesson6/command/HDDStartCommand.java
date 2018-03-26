package lesson6.command;

/**
 * �������� -- HDD��������
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