package collectionsequalshash;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book searchedBook = new Book(title, author);
        for (Book book : books) {
            if (book.equals(searchedBook)) {
                return book;
            }
        }
        return null;
    }

    public Book findBook(List<Book> books, Book book) {
        for (Book searchedBook : books) {
            if (searchedBook.equals(book)) {
                return book;
            }
        }
        return null;
    }

    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> result = new HashSet<>();
        for (Book book : books) {
            result.add(book);
        }
        return result;
    }
}
