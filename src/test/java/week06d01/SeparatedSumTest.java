package week06d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void sumTest() {
        String s = "3.4;-5;6.2;4.3;-2.1";
        SeparatedSum separatedSum = new SeparatedSum();

        assertEquals(13.9, separatedSum.sum(s).getSumPozitives(), 0.001 );
        assertEquals(-7.1, separatedSum.sum(s).getSumNegatives(), 0.001 );
    }


}