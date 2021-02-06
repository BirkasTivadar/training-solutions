package x;

public class Book implements Comparable<Book> {
    private int id;
    private String title;
    private String author;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo(Book o) {
        if (author.compareTo(o.author) !=0) {
            return author.compareTo(o.author);
        } else {
            return title.compareTo(o.getTitle());
        }
    }

    @Override
    public String toString() {
        return id + " " + author + " " + title;
    }
}
