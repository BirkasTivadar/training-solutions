package staticattrmeth.bank;

public class BankTransaction {
    private static final long MIN_TRX_VALUE = 1;
    private static final long MAX_TRX_VALUE = 10_000_000;
    private long trxValue;
    private static long sumOfTrxs = 0;
    private static long currentMinValue = MAX_TRX_VALUE;
    private static long currentMaxValue = MIN_TRX_VALUE;
    private static int countTrx = 0;


    public static long getCurrentMinValue() {
        return countTrx == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return countTrx == 0 ? 0 : currentMaxValue;
    }

    public long getTrxValue() {
        return trxValue;
    }

    public static long getSumOfTrxs() {
        return sumOfTrxs;
    }

    public static void initTheDay() {
        countTrx = 0;
        sumOfTrxs = 0;
        currentMinValue = MAX_TRX_VALUE;
        currentMaxValue = MIN_TRX_VALUE;
    }

    public BankTransaction(long trxValue) {
        if (trxValue < 1 || trxValue > 10_000_000) {
            throw new IllegalArgumentException("Value of transaction must be betweeen 1 and 10.000.000");
        }
        countTrx++;
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

    public static long averageOfTransaction() {
        return countTrx == 0 ? 0 : sumOfTrxs / countTrx;
    }


}
