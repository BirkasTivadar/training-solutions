package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void wordsWithChar() {
        WordFilter wordFilter = new WordFilter();
        List<String> words = new ArrayList<>();
        words.add("kutya");
        words.add("macska");
        words.add("körte");
        words.add("egér");
        words.add("ablak");

        assertEquals(3, wordFilter.wordsWithChar(words, 'a').size());
        assertEquals(2, wordFilter.wordsWithChar(words, 'e').size());
        assertEquals(0, wordFilter.wordsWithChar(words, 'ü').size());
    }
}