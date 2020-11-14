package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void sayHelloTest(){
        Gentleman gentleman = new Gentleman();

        assertEquals("Hello Bibi", gentleman.sayHello("Bibi"));
    }
}
