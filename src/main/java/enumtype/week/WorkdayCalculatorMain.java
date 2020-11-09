package enumtype.week;

import java.util.List;

public class WorkdayCalculatorMain {

    public static void main(String[] args) {
        WorkdayCalculator workdayCalculator = new WorkdayCalculator();

        System.out.println(workdayCalculator.dayTypes(Day.FRIDAY, 12));
    }
}
