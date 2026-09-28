import java.util.ArrayDeque;
import java.util.Deque;

public class EditorApp {

    private final Deque<Command> commandHistory;

    public EditorApp() {
        commandHistory = new ArrayDeque<>();
    }

    public void executeCommand(Command command) {
        command.execute();

        // Add the executed command to the top of the history stack
        commandHistory.push(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            // Remove the most recent command
            Command command = commandHistory.pop();

            // Undo that command
            command.undo();
        }
    }
}