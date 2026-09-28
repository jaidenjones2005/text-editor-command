public class Main {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        Command firstInsert =
                new InsertCommand(editor, "Hello", 0);

        Command secondInsert =
                new InsertCommand(editor, " World", 5);

        Command thirdInsert =
                new InsertCommand(editor, "!", 11);

        // Execute first command
        app.executeCommand(firstInsert);
        System.out.println("After first insert: \""
                + editor.getContent() + "\"");

        // Execute second command
        app.executeCommand(secondInsert);
        System.out.println("After second insert: \""
                + editor.getContent() + "\"");

        // Execute third command
        app.executeCommand(thirdInsert);
        System.out.println("After third insert: \""
                + editor.getContent() + "\"");

        System.out.println();

        // Undo third command
        app.undo();
        System.out.println("After first undo: \""
                + editor.getContent() + "\"");

        // Undo second command
        app.undo();
        System.out.println("After second undo: \""
                + editor.getContent() + "\"");

        // Undo first command
        app.undo();
        System.out.println("After third undo: \""
                + editor.getContent() + "\"");
    }
}