package defaultconstructor.date;

public class SimpleDateFormatter {

    public String formatDateString(SimpleDate simpleDate) {
        return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        switch (countryCode) {
            case US:
                return simpleDate.getMonth() + "-" + simpleDate.getDay() + "-" + simpleDate.getYear();
            case EN:
                return simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
        }
        return formatDateString(simpleDate);
    }
}
