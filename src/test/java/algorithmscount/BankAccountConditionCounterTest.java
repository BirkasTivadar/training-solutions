package algorithmscount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    @Test
    void testCountWithBalanceGreaterThan() {
        BankAccountConditionCounter bankAccountConditionCounter = new BankAccountConditionCounter();
        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("John Doe", "123", 100),
                new BankAccount("Jane Doe", "123", 200),
                new BankAccount("Joe Doe", "123", 300),
                new BankAccount("Jennifer Doe", "123", 400));

        assertEquals(3, bankAccountConditionCounter.countWithBalanceGreaterThan(bankAccounts, 100));
        assertEquals(0, bankAccountConditionCounter.countWithBalanceGreaterThan(bankAccounts, 400));
    }
}