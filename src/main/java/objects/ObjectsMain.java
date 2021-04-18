package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        new Book();

        System.out.println(new Book() + "\n");

        Book emptyBook;
        // System.out.println(emptyBook);

        emptyBook = null;
        System.out.println(emptyBook + "\n");

        System.out.println(emptyBook == null);

        Book book = new Book();
        System.out.println("\n" + book);

        book = null;
        System.out.println("\n" + book + "\n");

        book = new Book();
        System.out.println(book + "\n");

        Book anotherBook = new Book();
        System.out.println((book == anotherBook) + "\n");
        System.out.println(anotherBook instanceof Book);

        //Objektumok száma: 5 objektumot hoz létre. Hathoz lehet hozzáférni.

        Book[] bookArray = {emptyBook, book, anotherBook};

        List<Book> bookList = Arrays.asList(book, emptyBook, anotherBook);

        List<Book> anotherBookList = new ArrayList<>();

        anotherBookList.add(emptyBook);

        anotherBookList.add(book);

        anotherBookList.add(anotherBook);
    }
}
