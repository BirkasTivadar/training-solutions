package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {
    private List<String> authors;
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if (authors == null || authors.size() < 1 || numberOfPages < 1) {
            throw new IllegalArgumentException();
        }
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private boolean isBlank(String str) {
        return str == null || str.isBlank();
    }

}
