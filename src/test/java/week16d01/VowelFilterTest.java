package week16d01;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class VowelFilterTest {


    @Test
    void testFilterVowels() throws IOException {

        Path path = Path.of("testvowels.txt");

        BufferedReader bufferedReader = Files.newBufferedReader(path);

        VowelFilter vowelFilter = new VowelFilter();

        String expected = """
                prcsk
                Klpcsk
                Bnn
                Cscsk
                Mcsk
                Mcsk""";

        assertEquals(expected, vowelFilter.filterVowels(bufferedReader));
    }
}