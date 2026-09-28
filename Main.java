public class Main {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        // Insert the original text
        Command insertCommand =
                new InsertCommand(editor, "Hello World!", 0);

        app.executeCommand(insertCommand);

        System.out.println(
                "After insert: \"" + editor.getContent() + "\""
        );

        // Delete "World"
        // Hello World!
        //       ^^^^^
        //       6 - 11
        Command deleteCommand =
                new DeleteCommand(editor, 6, 11);

        app.executeCommand(deleteCommand);

        System.out.println(
                "After delete: \"" + editor.getContent() + "\""
        );

        // Undo the deletion
        app.undo();

        System.out.println(
                "After undo: \"" + editor.getContent() + "\""
        );
    }
}