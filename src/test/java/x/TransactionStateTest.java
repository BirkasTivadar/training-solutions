package x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionStateTest {


@Test
    void testIsCompleted(){
    TransactionState hasTransactionState = TransactionState.PENDING;
    assertFalse(hasTransactionState.isCompleted());
}
}