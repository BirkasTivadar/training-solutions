package iofilestest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testBook() {
        Book book = new Book("Solohov", "Tyihij Don");
        assertEquals("Solohov", book.getAuthor());
        assertEquals("Tyihij Don", book.getTitle());
    }

    @Test
    void testBookWithoutTitle() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()->  new Book("Solohov", " "));
        assertEquals("Author or title is empty!", iae.getMessage());
    }

}