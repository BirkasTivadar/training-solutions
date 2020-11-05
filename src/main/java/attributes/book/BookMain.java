package attributes.book;

import classstructureintegrate.Bank;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Csendes Don");
        System.out.println(book.getTitle());

        book.setTitle("Vadon szava");
        System.out.println(book.getTitle());

    }
}
