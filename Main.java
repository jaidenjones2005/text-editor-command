public class Main {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        EditorApp app = new EditorApp();

        Command insertCommand =
                new InsertCommand(editor, "Hello World!", 0);

        app.executeCommand(insertCommand);

        System.out.println("Editor content: " + editor.getContent());
    }
}