package iotest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void add(Book... books) {
        for (Book book : books) {
            this.books.add(book);
        }
    }

    public void saveBooks(Path file) {
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (Book book : books) {
                writer.write(book.getAuthor() + ": " + book.getTitle() + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }
}
