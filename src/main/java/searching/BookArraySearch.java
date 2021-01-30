package searching;

import java.util.Arrays;
import java.util.Collections;

public class BookArraySearch {
    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if (author == null || title == null || author.isBlank() || title.isBlank()) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        Book book = new Book(author, title);
        Arrays.sort(bookArray);
        int index = Arrays.binarySearch(bookArray, book);
        if (index < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        } else {
            return bookArray[index];
        }
    }
}
