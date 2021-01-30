package x;

import org.junit.jupiter.api.Test;

import java.text.Collator;
import java.util.*;
import java.util.concurrent.Callable;


import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testSort() {
        List<String> names = Arrays.asList("Joe", "Jack", "Jane");
        Collections.sort(names);
        assertEquals("[Jack, Jane, Joe]", names.toString());
    }

    @Test
    void testTrainerSort() {
        List<Trainer> trainers = Arrays.asList(
                new Trainer("Joe", 3),
                new Trainer("Jack", 2),
                new Trainer("Jane", 1)
        );
        Collections.sort(trainers);
        assertEquals("Jack", trainers.get(0).getName());

        Collections.sort(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
        assertEquals("Jane", trainers.get(0).getName());

        Collections.sort(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        assertEquals("Joe", trainers.get(0).getName());
    }

    public class SalaryComparator implements Comparator<Trainer> {
        @Override
        public int compare(Trainer o1, Trainer o2) {
            return o1.getSalary() - o2.getSalary();
        }
    }


    @Test
    void testSortWithAccutes() {
        List<String> names = Arrays.asList("Joe", "Jack", "Jane", "Ábel", "éva", "jack");
        Collections.sort(names, Collator.getInstance(new Locale("hu", "HU")));
        System.out.println(names);
    }

}