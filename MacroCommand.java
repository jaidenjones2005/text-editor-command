import java.util.List;

public class MacroCommand implements Command {

    private final List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        // Execute commands in normal order
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        // Undo commands in reverse order
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }
}