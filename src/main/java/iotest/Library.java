package iotest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void add(Book... books) {
        for (Book book : books) {
            this.books.add(book);
        }
    }

    public void saveBooks(Path path) {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Book book : books) {
                writer.write(book.getAuthor() + ": " + book.getTitle() + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write this file", ioe);
        }
    }

    public void loadBooks(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookString = line.split(": ");
                Book book = new Book(bookString[0],bookString[1]);
                if(!books.contains(book)){
                    books.add(book);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read this file.", e);
        }
    }
}
