package controliteration.pi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiGeneratorTest {

    @Test
    void getPi() {
        PiGenerator piGenerator = new PiGenerator();
        assertEquals("3.141592653589793238462643383279", piGenerator.getPi() );
    }
}