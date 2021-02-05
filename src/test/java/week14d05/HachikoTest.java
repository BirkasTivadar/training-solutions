package week14d05;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HachikoTest {

    @Test
    void testCountWords(){
        Hachiko hachiko = new Hachiko();
        Map<String, Integer> result = new HashMap<>();
        result.put("haza", 15);
        result.put("Hachiko", 4);
        result.put("jó", 15);
        result.put("pályaudvar", 5);

        assertEquals(result, hachiko.countWords("hachiko.srt", "Hachiko", "haza",
                "pályaudvar", "jó"));
    }

}