package controlselection.month;

public class DayInMonth {
    public int dayNumber(int year, String month) {
        String honap = month.toLowerCase();
        switch (honap) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                return 31;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                return 30;
            case "február":
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                throw new IllegalArgumentException("Rossz hónapnév: " + month);

        }
    }

    public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(dayInMonth.dayNumber(1600, "február"));
        System.out.println(dayInMonth.dayNumber(1800, "február"));
        System.out.println(dayInMonth.dayNumber(1804, "február"));
        System.out.println(dayInMonth.dayNumber(1600, "márciu"));

    }


}
