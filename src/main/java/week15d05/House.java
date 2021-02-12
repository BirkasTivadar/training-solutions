package week15d05;

public class House implements Comparable<House>{

    private String name;
    private int battle;

    public House(String name, int battle) {
        this.name = name;
        this.battle = battle;
    }

    public String getName() {
        return name;
    }

    public int getBattle() {
        return battle;
    }

    public void incrementBattle(){
        battle++;
    }


    @Override
    public int compareTo(House o) {
        return o.getBattle() - this.battle;
    }
}


