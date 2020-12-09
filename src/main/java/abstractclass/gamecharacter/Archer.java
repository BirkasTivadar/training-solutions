package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character{
    private int numberOfArrow;

    public Archer(Point position, Random rnd) {
        super(position, rnd);
        this.numberOfArrow = 100;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage() {
        return super.getRnd().nextInt(4) + 1;
    }

    private void shootingArrow(Character enemy){
        numberOfArrow--;
        hit(enemy, getActualSecondaryDamage());
    }

    public void secondaryAttack(Character enemy){
        shootingArrow(enemy);
    }
}
