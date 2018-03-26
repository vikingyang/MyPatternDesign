package lesson6.command;

public interface MacroCommand extends Command {
	void addCommand(Command command);

	void removeCommand(Command command);
}