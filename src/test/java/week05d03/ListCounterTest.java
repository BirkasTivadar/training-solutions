package week05d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCounterTest {

    @Test
    void counterStartATest(){
        ListCounter listCounter = new ListCounter();
        List<String> list = Arrays.asList("alma", "Körte", "áfonya", "Ablak");
        assertEquals(2, listCounter.counterStartA(list));
    }
}