package collectionsequalshash;

import java.util.*;

public class BookCatalog {
    private List<Book> books = new ArrayList<>();

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book searchBook = new Book(title, author);
        for (Book book : books) {
            if (book.equals(searchBook)) {
                return book;
            }
        }
        return null;
    }

    public Book findBook(List<Book> books, Book book) {
        for (Book findB : books) {
            if (findB.equals(book)) {
                return findB;
            }
        }
        return null;
    }

    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> setBooks = new HashSet<>();
        for (Book book : books) {
            setBooks.add(book);
        }
        return setBooks;
    }
}
