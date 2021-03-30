package lambdastreams.bookstore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public int getNumberOfBooks() {
        return books.stream().reduce(0, (i, e) -> i + e.getQuantity(), (b1, b2) -> b1 + b2);
    }

    public Optional<Book> findNewestBook() {
        return books.stream().max(Comparator.comparing(Book::getYearOfPublish));
    }

    public int getTotalValue() {
        return books.stream().reduce(0, (i, e) -> i + e.getQuantity() * e.getPrice(), (i1, i2) -> i1 + i2);
    }
}
