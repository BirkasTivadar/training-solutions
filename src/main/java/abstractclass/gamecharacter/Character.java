package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    private Point position;
    private int hitPoint = 100;
    private Random rnd = new Random();

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimariDamage() {
        return rnd.nextInt(9) + 1;
    }

    private int getActualDefence() {
        return rnd.nextInt(5);
    }

    protected void hit(Character enemy, int damage) {
        if (getActualDefence() < damage) {
            decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimariDamage());
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    abstract public void secondaryAttack(Character enemy);

}
