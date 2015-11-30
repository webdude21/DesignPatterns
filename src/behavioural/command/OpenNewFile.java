package behavioural.command;

public class OpenNewFile implements Command {

    boolean currentFileIsBlank = false;

    @Override
    public boolean canExecute() {
        return !currentFileIsBlank;
    }

    @Override
    public void execute() {
        currentFileIsBlank = true;
    }

    @Override
    public void undo() {
        currentFileIsBlank = false;
    }
}
