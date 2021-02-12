package iofilestest.library;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        if (author == null || author.isBlank() || title == null || title.isBlank()){
            throw new IllegalArgumentException("Author or title is empty!");
        }
            this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
