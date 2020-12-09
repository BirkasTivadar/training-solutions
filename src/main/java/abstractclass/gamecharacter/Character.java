package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    private Point position;
    private int hitPoint = 100;
    private Random rnd;

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRnd() {
        return rnd;
    }

    public Character(Point position, Random rnd) {
        this.position = position;
        this.rnd = rnd;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return rnd.nextInt(9) + 1;
    }

    private int getActualDefence() {
        return rnd.nextInt(5);
    }

    protected void hit(Character enemy, int damage) {
        if (enemy.getActualDefence() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    abstract public void secondaryAttack(Character enemy);

}
