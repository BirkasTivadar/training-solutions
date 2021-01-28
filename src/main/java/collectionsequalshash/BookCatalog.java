package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public Book findBookByTitleAuthor(List<Book> books, String title, String author){
        Book searchBook = new Book("1", title, author);
        for(Book book :books){
            if(book.equals(searchBook)){
                return book;
            }
        }
        return null;
    }

    public Book findBook(List<Book> books, Book book){
        for(Book findB : books){
            if(findB.equals(book)){
                return findB;
            }
        }
        return null;
    }
}
