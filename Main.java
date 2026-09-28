import java.util.List;

public class Main {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        // Create the individual commands for our template
        Command header =
                new InsertCommand(editor, "=== TRAVEL NOTES ===", 0);

        Command newLine =
                new InsertCommand(editor, "\n", 20);

        Command footer =
                new InsertCommand(editor, "=== END ===", 21);

        // Combine the commands into one MacroCommand
        Command templateMacro = new MacroCommand(
                List.of(header, newLine, footer)
        );

        System.out.println(
                "Before macro:\n\"" + editor.getContent() + "\""
        );

        // EditorApp treats the entire macro as one command
        app.executeCommand(templateMacro);

        System.out.println(
                "\nAfter macro:\n" + editor.getContent()
        );

        // One undo removes the entire macro
        app.undo();

        System.out.println(
                "\nAfter one undo:\n\"" + editor.getContent() + "\""
        );
    }
}