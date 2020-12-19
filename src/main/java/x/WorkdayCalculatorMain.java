package x;

public class WorkdayCalculatorMain {

    public static void main(String[] args) {
        WorkDayCalculator workdayCalculator = new WorkDayCalculator();

        System.out.println(workdayCalculator.dayTypes(Day.FRIDAY, 12));
    }

}

