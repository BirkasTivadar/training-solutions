package x;

public class BankTransaction {
    public static final int MIN = 1;
    public static final int MAX = 10_000_000;

    public static int transactionCounter;

    public static long currentMinValue;
    public static long currentMaxValue;
    public static long sumOfTrxs;

    private long trxValue;

    public long getTrxValue() {
        return trxValue;
    }

    public BankTransaction(long trxValue) {
        if (trxValue < MIN || trxValue > MAX) {
            throw new IllegalArgumentException("Invalid data");
        }
        transactionCounter++;
        if (trxValue < currentMinValue) {
            currentMinValue = trxValue;
        }
        if (trxValue > currentMaxValue) {
            currentMaxValue = trxValue;
        }
        sumOfTrxs += trxValue;
        this.trxValue = trxValue;
    }

    public static long getCurrentMinValue() {
        return transactionCounter == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return transactionCounter == 0 ? 0 : currentMaxValue;
    }

    public static long getSumOfTrxs() {
        return sumOfTrxs;
    }

    public static void initTheDay() {
        transactionCounter = 0;
        currentMinValue = Long.MAX_VALUE;
        currentMaxValue = Long.MIN_VALUE;
        sumOfTrxs = 0;
    }

    public static long averageOfTransaction() {
        return transactionCounter == 0 ? 0 : sumOfTrxs / transactionCounter;
    }
}
