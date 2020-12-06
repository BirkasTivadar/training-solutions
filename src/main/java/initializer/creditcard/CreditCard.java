package initializer.creditcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCard {

    private static final List<Rate> ACTUAL_RATES = new ArrayList<>();

    private long balance;

    static {
        final Rate[] rates = {new Rate(Currency.HUF, 1.0),
                new Rate(Currency.EUR, 308.23),
                new Rate(Currency.SFR, 289.24),
                new Rate(Currency.GBP, 362.23),
                new Rate(Currency.USD, 289.77)};
        for (Rate rate : rates) {
            ACTUAL_RATES.add(rate);
        }
    }

    public static List<Rate> getActualRates() {
        return ACTUAL_RATES;
    }

    public long getBalance() {
        return balance;
    }


    public CreditCard(long balance, Currency currency, List<Rate> rates) {
        ACTUAL_RATES.addAll(rates);
        this.balance = (long) (balance * getConversionRate(currency));
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public boolean payment(long amount, Currency currency) {
        long value = (long) (amount * getConversionRate(currency));
        if (value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {
        return payment(amount, Currency.HUF);
    }

    private double getConversionRate(Currency currency) {
        for (Rate rate : ACTUAL_RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        return 1.0;
    }
}
