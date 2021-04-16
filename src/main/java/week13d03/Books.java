package week13d03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Books {

    private List<Book> books;

    public Books(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public void add(Book book) {
        books.add(book);
    }

    public String getMostProductiveAuthor() {
        if (books == null) {
            throw new NullPointerException("Books must not be null or empty");
        }
        return books.stream().max(Comparator.comparingInt(Book::getNumberOfPages)).get().getAuthor();
    }
}
