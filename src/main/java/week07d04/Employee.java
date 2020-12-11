package week07d04;

public class Employee {
    private int salary;
    private BonusCalculator calculator;


    public Employee(int salary, BonusCalculator calculator) {
        this.salary = salary;
        this.calculator = calculator;
    }

    public int getBonus(){
        return calculator.calculateBonus(salary);
    }


    public static void main(String[] args) {
        FixBonusCalculator fixBonusCalculator = new FixBonusCalculator();
        PercentBonusCalculator percentBonusCalculator = new PercentBonusCalculator();

        Employee employee = new Employee(100_000, fixBonusCalculator);
        Employee boss = new Employee(600_000, percentBonusCalculator);

        System.out.println(employee.getBonus());
        System.out.println(boss.getBonus());
    }
}
