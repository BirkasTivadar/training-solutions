package week14d01;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    void testIndexer(){
        List<String> names = new ArrayList<>(Arrays.asList("Joe", "John", "Carlos", "Jaime", "Anna", "Maria"));

        Indexer indexer = new Indexer();

       assertEquals("{A=[Anna], C=[Carlos], J=[Joe, John, Jaime], M=[Maria]}", indexer.index(names).toString());
    }

}