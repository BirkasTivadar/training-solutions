package defaultconstructor.date;

public class SimpleDateFormatter {
    private CountryCode code;
    private SimpleDate simpleDate;

    public SimpleDateFormatter() {
        this.code = CountryCode.HU;
        this.simpleDate = simpleDate;
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
