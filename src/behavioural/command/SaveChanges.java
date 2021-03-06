package behavioural.command;

public class SaveChanges implements Command {

	private boolean hasUnsavedChanges;

	@Override
	public boolean canExecute() {
		return hasUnsavedChanges;
	}

	@Override
	public void execute() {
		hasUnsavedChanges = false;
	}

	@Override
	public void undo() {
		hasUnsavedChanges = true;
	}
}
