package week07d04;

public class FixBonusCalculator implements BonusCalculator{

    @Override
    public int calculateBonus(int salary) {
        return salary + 10_000;
    }
}
