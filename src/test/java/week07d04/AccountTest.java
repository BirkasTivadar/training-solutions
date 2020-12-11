package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testCreatedAfter() {
        Account account = new Account(LocalDateTime.of(2018, 1, 1, 10, 0));
        assertFalse(account.createdAfter(LocalDateTime.now()));

    }

}