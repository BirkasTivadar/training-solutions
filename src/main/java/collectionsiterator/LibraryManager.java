package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber) {
        for (Book book : libraryBooks) {
            if (book.getRegNumber() == regNumber) {
                return book;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        Iterator<Book> i = libraryBooks.iterator();
        while (i.hasNext()) {
            Book book = i.next();
            if (book.getRegNumber() == regNumber) {
                i.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> result = new HashSet<>();
        for (Book book : libraryBooks) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        if (result.isEmpty()) {
            throw new MissingBookException(String.format("No books found by %s", author));
        }
        return result;
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }
}
