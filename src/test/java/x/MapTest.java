package x;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class MapTest {
    @Test
    void testMap() {
        Map<String, String> codes = new HashMap<>();
        assertEquals(0, codes.size());
        codes.put("200", "OK");
        codes.put("404", "Found");
        System.out.println(codes);
        codes.put("404", "Not Found");
        System.out.println(codes);
        String s = codes.get("404");
        System.out.println(s);
        codes.put("304", "Not Modified");
        codes.remove("200");
        System.out.println(codes);

        assertTrue(codes.containsKey("304"));
        assertFalse(codes.containsKey("200"));
        assertFalse(codes.containsValue("OK"));
        assertTrue(codes.containsValue("Not Modified"));

        System.out.println(codes.keySet());
        System.out.println(codes.values());
        System.out.println(codes.entrySet());

        for(Map.Entry entries : codes.entrySet()){
            System.out.print(entries.getKey()+"\t");
            System.out.println(entries.getValue());
        }

        codes.clear();
        assertTrue(codes.isEmpty());
    }

    @Test
    void testTrainerMap() {
        List<Trainer> trainers = Arrays.asList(
                new Trainer(1L, "John"),
                new Trainer(2L, "Jack"),
                new Trainer(3L, "Jane"),
                new Trainer(4L, "Joe")
        );

        Map<Long, Trainer> m = new HashMap<>();
        for (Trainer trainer : trainers) {
            m.put(trainer.getId(), trainer);
        }

        Trainer tr = m.get(3L);
        System.out.println(tr.getName());
    }


}
