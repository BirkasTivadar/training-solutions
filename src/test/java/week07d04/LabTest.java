package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    @Test
    void createWithOneParam() {
        Lab lab = new Lab("kesztyűzés");
        assertEquals("kesztyűzés", lab.getTitle());
        assertFalse(lab.isCompleted());
    }

    @Test
    void createWithTwoParam() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 12, 11, 0);
        Lab lab = new Lab("zsákolás", localDateTime);
        assertEquals("zsákolás", lab.getTitle());
        assertEquals(localDateTime, lab.getCompletedAt());
        assertTrue(lab.isCompleted());
    }

    @Test
    void completeWithParam() {
        Lab lab = new Lab("kesztyűzés");
        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 12, 11, 0);
        assertFalse(lab.isCompleted());
        lab.complete(localDateTime);
        assertEquals(localDateTime, lab.getCompletedAt());
        assertTrue(lab.isCompleted());
    }

    @Test
    void completeWithoutParam() {
        Lab lab = new Lab("kesztyűzés");
        assertFalse(lab.isCompleted());
        lab.complete();
        assertTrue(LocalDateTime.now().isBefore(lab.getCompletedAt().plusSeconds(1)));
        assertTrue(LocalDateTime.now().isAfter(lab.getCompletedAt()));
        assertTrue(lab.isCompleted());
    }
}