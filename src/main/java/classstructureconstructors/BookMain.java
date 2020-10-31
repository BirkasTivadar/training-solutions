package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Solohov", "Csendes Don");
        book.register("1926");

        System.out.println("Author: " +book.getAuthor());
        System.out.println("Title: " +book.getTitle());
        System.out.println("Registry number: " +book.getRegNumber());

    }
}
