package objects;

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

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        System.out.println(anotherBook instanceof Book);


    }

}
