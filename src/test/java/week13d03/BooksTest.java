package week13d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @Test
    void testGetMostProductiveAuthorWithNull() {
        NullPointerException npe = assertThrows(NullPointerException.class, () -> new Books(null).getMostProductiveAuthor());
        assertEquals("Books must not be null or empty", npe.getMessage());
    }

    @Test
    void testGetMostProductiveAuthor() {
        Books books = new Books(Arrays.asList(
                new Book("Solohov", "Csendes Don", 353),
                new Book("Jack London", "A vadon szava", 231),
                new Book("Lev Tolsztoj", "Háború és Béke", 567),
                new Book("Gárdonyi Géza", "Egri Csillagok", 342)
        ));

        assertEquals("Lev Tolsztoj", books.getMostProductiveAuthor());
    }


}