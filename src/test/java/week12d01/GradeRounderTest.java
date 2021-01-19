package week12d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {


    @Test
    void roundGrades() {
        GradeRounder gradeRounder = new GradeRounder();
        int[] grades = new int[]{23, 57, 68, 43, 99, 1, 56};
        int[] roundGrades = new int[]{23, 55, 70, 45, 100, 1, 55};
        assertArrayEquals(roundGrades, gradeRounder.roundGrades(grades));
    }
}