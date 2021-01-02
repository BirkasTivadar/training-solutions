package abstractclass.gamecharacter;

public class Battlefield {

    private int round = 0;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender) {
        if(attacker.isAlive() && defender.isAlive()){
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
            return true;
        }
        return false;
    }

    public Character fight(Character one, Character other){
        while (oneHit(one, other)){
            round++;
            oneHit(one,other);
            oneHit(other, one);
        }
        return one.isAlive() ? one : other;
    }
}
