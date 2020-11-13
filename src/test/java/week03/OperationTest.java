package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void getResult() {
        Operation operation = new Operation("123+456");

        int result = operation.getResult();

        assertEquals(579, result);
    }
}