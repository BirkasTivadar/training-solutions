package algorithmsdecision;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    List<BankAccount> accounts = Arrays.asList(
            new BankAccount("Fred", "123-324-123", 100),
            new BankAccount("Kate", "133-324-123", 200),
            new BankAccount("Mary", "143-324-123", 90)
    );

    @Test
    void testContainsBalanceGreaterThan() {
        BankAccountDecisionMaker bankAccountDecisionMaker = new BankAccountDecisionMaker();
        assertEquals(true, bankAccountDecisionMaker.containsBalanceGreaterThan(accounts, 150));
        assertEquals(false, bankAccountDecisionMaker.containsBalanceGreaterThan(accounts, 250));
    }

}