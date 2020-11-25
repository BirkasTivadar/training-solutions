package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCounterTest {

    @Test
    void counterStartATestA() {
        ListCounter listCounter = new ListCounter();
        List<String> list = Arrays.asList("alma", "Körte", "áfonya", "Ablak");
        assertEquals(2, listCounter.counterStartA(list));
    }

    @Test
    void counterStartATestB() {
        ListCounter listCounter = new ListCounter();
        List<String> list = Arrays.asList("falma", "Körte", "áfonya", "BAblak");
        assertEquals(0, listCounter.counterStartA(list));
    }

    @Test
    void counterStartATestWithEmptyList() {
        ListCounter listCounter = new ListCounter();
        List<String> list = new ArrayList<>();
        assertEquals(0, listCounter.counterStartA(list));
    }

}