package staticattrmeth.bank;

public class BankTransaction {
    private long trxValue;
    private static long sumOfTrxs;
    private static long currentMinValue;
    private static long currentMaxValue;

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    public long getTrxValue() {
        return trxValue;
    }

    public static long getSumOfTrxs() {
        return sumOfTrxs;
    }

    public static void initTheDay() {
        sumOfTrxs = 0;
        currentMaxValue = 0;
        currentMinValue = 0;

    }

    public BankTransaction(int trxValue) {
        if (trxValue < 1 || trxValue > 10_000_000) {
            throw new IllegalArgumentException("Value of transaction must be betweeen 1 and 10.000.000")
        }
        sumOfTrxs += trxValue;
        Min(trxValue);
        Max(trxValue);
        this.trxValue = trxValue;
    }

    public void Min(long value) {
        if (value < currentMinValue) {
            currentMinValue = value;
        }
    }

    public void Max(long value) {
        if (value > currentMaxValue) {
            currentMaxValue = value;
        }
    }


}
