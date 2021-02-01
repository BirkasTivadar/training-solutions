package week14d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    void testIndexer(){
        List<String> names = new ArrayList<>(Arrays.asList(
                "Joe", "John", "Carlos", "Jaime", "Anna", "Maria"
        ));

        Indexer indexer = new Indexer();


        Map<Character, List<String>> mapNames = indexer.index(names);
        System.out.println(mapNames);
    }

}