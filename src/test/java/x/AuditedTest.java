package x;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuditedTest {
    @Test
    void testFind() {
        List<Audited> values = new ArrayList<>();
        values.add(new Employee("John Doe", LocalDateTime.of(2019, 1, 1, 10, 0)));
        values.add(new Employee("Jane Doe", LocalDateTime.of(2019, 1, 2, 10, 0)));
        Audited audited = Audited.findLastCreated(values);
        assertEquals(audited, values.get(1));
        assertEquals("Jane Doe", ((Employee)audited).getName());

    }

}