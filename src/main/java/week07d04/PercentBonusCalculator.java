package week07d04;

public class PercentBonusCalculator implements BonusCalculator {
    @Override
    public int calculateBonus(int salary) {
        return salary * 2;
    }
}
