package week07d05;

public class Paper implements Writeable, Erasable {

    private String content = "";

    private int maxContentSize = DEFAULT_CONTENT_SIZE;

    public String getContent() {
        return content;
    }

    @Override
    public void erase() {
        content = "";

    }

    @Override
    public boolean write(String text) {
        String newContent = content + text;
        if(newContent.length() <= maxContentSize){
            content = newContent;
            return true;
        }
        return false;
    }

}
