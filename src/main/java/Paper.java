public class Paper {

    private String content = "";

    public String getText() {
        return content;
    }

    public void write(String text) {
        content += text;
    }

    public void erase(String text) {
        int firstLetterIndex = content.lastIndexOf(text);
        int terminatingIndex = firstLetterIndex + text.length();
        String erasedWord = text.replaceAll(".", " ");

        StringBuilder newText = new StringBuilder(content);
        newText.replace(firstLetterIndex, terminatingIndex, erasedWord);
        content = newText.toString();
    }
}
