package collectionsclass;

public class Book implements Comparable<Book> {

    private int id;
    private String author;
    private String title;


    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        if (id != o.getId()) {
            return id - o.getId();
        } else if (author.compareTo(o.getAuthor()) != 0) {
            return author.compareTo(o.getTitle());
        } else {
            return title.compareTo(o.getTitle());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + author + " " + title;
    }
}
