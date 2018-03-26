package lesson6.command;

import java.util.ArrayList;

/**
 * ������ӿ�ʵ��
 */
public class ComputerMacroCommand implements MacroCommand {
	private ArrayList<Command> commands = null;

	public ComputerMacroCommand() {
		commands = new ArrayList<Command>();
	}

	@Override
	public void addCommand(Command command) {
		commands.add(command);
	}

	@Override
	public void removeCommand(Command command) {
		commands.remove(command);
	}

	@Override
	public void execute() {
		for (int i = 0; i < commands.size(); i++) {
			commands.get(i).execute();
		}
	}

}