package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount = new BankAccount("Fred", "123-324-123", 100);

    @Test
    void testCreateBankAccount() {
        assertEquals("123-324-123", bankAccount.getAccountNumber());
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        bankAccount.withdraw(50);
        assertEquals(50, bankAccount.getBalance());
        assertEquals(false, bankAccount.withdraw(110));
        assertEquals(true, bankAccount.withdraw(20));
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(100);
        assertEquals(200, bankAccount.getBalance());
        assertEquals(true, bankAccount.deposit(20));
    }

}