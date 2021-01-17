package iotest;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void add(Book... books){
        for(Book book : books){
            this.books.add(book);
        }
    }
}
