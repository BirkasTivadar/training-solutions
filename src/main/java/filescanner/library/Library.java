package filescanner.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void loadFromFile() {
        try (Scanner scanner = new Scanner(Library.class.getResourceAsStream("/books.csv")).useDelimiter(";|(\r\n)")) {
            while (scanner.hasNext()) {
                String regNum = scanner.next();
                String author = scanner.next();
                String title = scanner.next();
                int year = scanner.nextInt();
                Book book = new Book(regNum, author, title, year);
                books.add(book);
            }
        }
    }
}
