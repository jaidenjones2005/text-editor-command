public class TextEditor {

    private final StringBuilder content;

    public TextEditor() {
        content = new StringBuilder();
    }

    public void insertText(int position, String text) {
        content.insert(position, text);
    }

    public String getContent() {
        return content.toString();
    }
}