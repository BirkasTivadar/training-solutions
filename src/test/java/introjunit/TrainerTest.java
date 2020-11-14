package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void getName() {
        Trainer trainer = new Trainer("Bibi");

        assertEquals("Bibi", trainer.getName());
    }
}