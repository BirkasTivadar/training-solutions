package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {



    public static void main(String[] args) {

        new Book();

        System.out.println(new Book());

        Book emptyBook;
        // System.out.println(emptyBook);

        emptyBook = null;
        System.out.println(emptyBook);

        Book book = new Book();
        System.out.println(book);

        book = null;
        System.out.println(book);
        System.out.println(book == emptyBook);

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        System.out.println(anotherBook instanceof Book);

        //Objektumok száma: 5 objektumot hoz létre. Hathoz lehet hozzáférni.

        Book[] bookArray = {emptyBook, book, anotherBook};

        List<Book> bookList = Arrays.asList(book, emptyBook, anotherBook);
        List<Book> bookList2 = Arrays.asList(bookArray);

        List<Book> anotherBookList = new ArrayList<>();
        anotherBookList.add(emptyBook);
        anotherBookList.add(book);
        anotherBookList.add(anotherBook);

    }

}
