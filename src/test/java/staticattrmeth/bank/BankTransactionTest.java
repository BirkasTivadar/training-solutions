package staticattrmeth.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {
    @Test
    public void testOneTransaction() {
        //Given
        BankTransaction.initTheDay();
        BankTransaction bankTransaction = new BankTransaction(10_000);
        assertEquals(10_000, bankTransaction.getTrxValue());
        assertEquals(10_000, BankTransaction.getCurrentMinValue());
        assertEquals(10_000, BankTransaction.getCurrentMaxValue());
        assertEquals(10_000, BankTransaction.getSumOfTrxs());
    }

    @Test
    public void testSeveralTransactions() {
        BankTransaction.initTheDay();
        new BankTransaction(10_000);
        new BankTransaction(20_000);
        assertEquals(10_000, BankTransaction.getCurrentMinValue());
        assertEquals(20_000, BankTransaction.getCurrentMaxValue());
        assertEquals(30_000, BankTransaction.getSumOfTrxs());
        assertEquals(15_000, BankTransaction.averageOfTransaction());
    }

    @Test
    public void testZeroTransaction() {
        BankTransaction.initTheDay();
        assertEquals(0, BankTransaction.getCurrentMinValue());
        assertEquals(0, BankTransaction.getCurrentMaxValue());
        assertEquals(0, BankTransaction.getSumOfTrxs());
    }

}