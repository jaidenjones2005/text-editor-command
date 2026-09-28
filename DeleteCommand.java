public class DeleteCommand implements Command {

    private final TextEditor editor;
    private final int start;
    private final int end;

    // Saves the text before it gets deleted
    private String deletedText;

    public DeleteCommand(TextEditor editor, int start, int end) {
        this.editor = editor;
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
        // Capture the text BEFORE deleting it
        deletedText = editor.getText(start, end);

        editor.deleteText(start, end);
    }

    @Override
    public void undo() {
        // Put the deleted text back where it originally was
        editor.insertText(start, deletedText);
    }
}