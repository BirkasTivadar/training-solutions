package iofilestest;

import iofilestest.library.Book;
import iofilestest.library.Library;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @TempDir
    public File folder;

    @Test
    void testCreateLibrary() {
        Book book1 = new Book("Solohov", "Csendes Don");
        Book book2 = new Book("Jack London", "A vadon szava");
        Book book3 = new Book("Cervantes", "Don Quijote");
        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        assertEquals(3, library.getBooks().size());
        assertEquals("Jack London", library.getBooks().get(1).getAuthor());
        assertEquals("Csendes Don", library.getBooks().get(0).getTitle());
    }

    @Test
    void testSaveAndLoadBooks() throws IOException {
        Book book1 = new Book("Solohov", "Csendes Don");
        Book book2 = new Book("Jack London", "A vadon szava");
        Book book3 = new Book("Cervantes", "Don Quijote");
        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        Path file = new File(folder, "books.txt").toPath();
        library.saveBooks(file);

        List<String> content = Files.readAllLines(file);
        assertEquals(3, content.size());
        assertEquals("Solohov: Csendes Don", content.get(0));
    }

}