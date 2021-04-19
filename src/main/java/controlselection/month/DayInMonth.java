package controlselection.month;

public class DayInMonth {

    public int dayNumber(int year, String month) {

        String honap = month.toLowerCase();

        return switch (honap) {

            case "január", "március", "május", "július", "augusztus", "október", "december" -> 31;

            case "április", "június", "szeptember", "november" -> 30;

            case "február" -> isLeapYear(year) ? 29 : 28;

            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
