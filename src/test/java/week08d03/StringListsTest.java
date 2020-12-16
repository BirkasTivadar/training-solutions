package week08d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {
    @Test
    void stringListsUnionTest() {
        StringLists stringLists = new StringLists();
        List<String> first = List.of("alma", "barack", "körte");
        List<String> second = List.of("alma", "dinnye", "körte");
        List<String> union = List.of("alma", "barack", "körte", "dinnye");
        assertEquals(union, stringLists.stringListsUnion(first, second));

    }

}