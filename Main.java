public class Main {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        Command insertCommand =
                new InsertCommand(editor, "Hello World!", 0);

        System.out.println("Before insert: \"" + editor.getContent() + "\"");

        app.executeCommand(insertCommand);

        System.out.println("After insert: \"" + editor.getContent() + "\"");

        app.undo();

        System.out.println("After undo: \"" + editor.getContent() + "\"");
    }
}