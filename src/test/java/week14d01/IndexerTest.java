package week14d01;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    void testIndexer() {
        List<String> names = new ArrayList<>(Arrays.asList("Joe", "John", "Carlos", "Jaime", "Anna", "Maria"));
        Indexer indexer = new Indexer();
        Map<Character, List<String>> testMap = Map.of('A', Arrays.asList("Anna"), 'C', Arrays.asList("Carlos"), 'J', Arrays.asList("Joe", "John", "Jaime"), 'M', Arrays.asList("Maria"));
        assertEquals(testMap, indexer.index(names));
    }
}