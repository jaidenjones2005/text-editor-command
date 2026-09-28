public class TextEditor {

    private final StringBuilder content;

    public TextEditor() {
        content = new StringBuilder();
    }

    public void insertText(int position, String text) {
        content.insert(position, text);
    }

    public void deleteText(int start, int end) {
        content.delete(start, end);
    }

    public String getText(int start, int end) {
        return content.substring(start, end);
    }

    public String getContent() {
        return content.toString();
    }
}