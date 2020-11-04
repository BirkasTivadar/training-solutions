package math.game;

import java.util.Random;

public class Warrior {
    private String name;
    private Point position;
    private int stamina;
    private double skill;

    public Warrior(String name, Point point){
        this.name = name;
        this.position = point;
        this.stamina = (new Random().nextInt(81)) + 20;
        this.skill = new Random().nextDouble();
    }

    public Point getPosition() {
        return position;
    }

    public void move(Warrior otherWarrior){
        int nextX = this.getPosition().getX();
        int nextY = this.getPosition().getY();
        if(this.getPosition().getX() < otherWarrior.getPosition().getX()) {
            nextX = this.getPosition().getX() + 1;
        } else if (this.getPosition().getX() > otherWarrior.getPosition().getX()) {
            nextX = this.getPosition().getX() -1;
        }
        if (this.getPosition().getY() < otherWarrior.getPosition().getY()) {
            nextY = this.getPosition().getY() + 1;
        } else if (this.getPosition().getY() > otherWarrior.getPosition().getY()) {
            nextY = this.getPosition().getY() - 1;
        }
        this.position = new Point(nextX, nextY);
    }

    public double distance(Warrior otherWarrior){
        return this.getPosition().distance(otherWarrior.getPosition());
    }

    public void attack(Warrior otherWarrior){
        if(this.skill > new Random().nextDouble()){
            otherWarrior.stamina -= (new Random().nextInt(3)) +1;
        }
    }

    public boolean isAlive(){
        return this.stamina > 0;
    }

    public String toString(){
        return this.name + ": (" + this.getPosition().getX() + "," + this.getPosition().getY() + ") " + this.stamina;
    }


}
