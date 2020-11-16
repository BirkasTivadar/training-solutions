package stringbasic.pets;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void addTest() {
        Vet vet = new Vet();
        vet.add(new Pet("Morzsi", LocalDate.of(2010, 11, 11), Gender.UNKNOWN, "123456"));
        vet.add(new Pet("Párizs", LocalDate.of(2012, 1, 18), Gender.MALE, "123400"));
        vet.add(new Pet("Zsömle", LocalDate.of(2015, 6, 7), Gender.MALE, "120056"));
        vet.add(new Pet("Zsömle", LocalDate.of(2015, 6, 7), Gender.MALE, "121256"));
        vet.add(new Pet("Flótás", LocalDate.of(2005, 2, 17), Gender.FEMALE, "121256"));

        assertEquals(4, vet.getPets().size());
    }


}