package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class StoryBook implements Printable{
    private List<ColoredPage> pages = new ArrayList<>();

    public void addPage(ColoredPage page){
        pages.add(page);
    }

    @Override
    public int getLength() {
        return pages.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return pages.get(pageNumber).toString();
    }
}
