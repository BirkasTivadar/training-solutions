package defaultconstructor.date;

public class SimpleDateFormatter {
    private CountryCode code;

    public SimpleDateFormatter() {
        this.code = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
        return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        switch (countryCode) {
            case EN:
                return simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
            case US:
                return simpleDate.getMonth() + "-" + simpleDate.getDay() + "-" + simpleDate.getYear();
            default:
                return formatDateString(simpleDate);
        }
    }

}
