package methodvarargs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {
    ExamStats examStats = new ExamStats(100);

    @Test
    public void zeroResultsShouldThrowException() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> examStats.getNumberOfTopGrades(85));
        assertEquals("Number of results must not be empty!", iae.getMessage());
    }

    @Test
    public void nullResultsShouldThrowException() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> examStats.getNumberOfTopGrades(85, null));
        assertEquals("Number of results must not be empty!", iae.getMessage());
    }


    @Test
    public void testGetNumberOfTopGrades() {
        assertEquals(3, examStats.getNumberOfTopGrades(85, 2, 3, 4, 5, 86, 90, 99));
        assertEquals(0, examStats.getNumberOfTopGrades(85, 2, 3, 4, 5, 56, 34, 70));
    }

    @Test
    public void testHasAnyFailed() {
        assertTrue(examStats.hasAnyFailed(50, 10, 90));
        assertFalse(examStats.hasAnyFailed(50, 60, 90));
    }

}