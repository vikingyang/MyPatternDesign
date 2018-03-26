package lesson6.command;

public class MBRStartCommand implements Command {
	private Computer computer;

	public MBRStartCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.startMBR();
	}
}