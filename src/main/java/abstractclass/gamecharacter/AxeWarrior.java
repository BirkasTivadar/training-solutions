package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {
    public AxeWarrior(Point position, Random rnd) {
        super(position, rnd);
    }

    private int getActualSecondaryDamage() {
        return super.getRnd().nextInt(getActualPrimaryDamage() * 2) + 1;
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if (getPosition().distance(enemy.getPosition()) < 2){
            hit(enemy,getActualSecondaryDamage());
        }
    }
}
