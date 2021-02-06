package x;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LibraryManager {

    private Set<Book> bookSet;

    public LibraryManager(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public int libraryBooksCount() {
        return bookSet.size();
    }

    public Book findBookByRegNumber(int regNumber) {
        for (Book book : bookSet) {
            if (book.getRegNumber() == regNumber) {
                return book;
            }
        }
        throw new MissingBookException(String.format("No books found with regnumber: %d", regNumber));
    }

    public int removeBookByRegNumber(int regNumber) {
        Iterator<Book> iter = bookSet.iterator();
        while (iter.hasNext()) {
            if (iter.next().getRegNumber() == regNumber) {
                iter.remove();
                return regNumber;
            }
        }
        throw new MissingBookException(String.format("No books found with regnumber: %d", regNumber));
    }

    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> result = new HashSet<>();
        Iterator<Book> iter = bookSet.iterator();
        while (iter.hasNext()) {
            Book book = iter.next();
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        if (result.isEmpty()) {
            throw new MissingBookException(String.format("No books found by %s", author));
        }
        return result;
    }
}
