package behavioural.command;

public interface Command {

	boolean canExecute();

	void execute();

	void undo();
}
