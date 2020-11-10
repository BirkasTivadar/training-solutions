package week03;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {
        Position boss = new Position("Boss", 500_000);
        Position jefe = new Position("Jefe", 450_000);
        Position director = new Position("Director", 320_000);
        Position manager = new Position("Manager", 150_000);
        Position employee = new Position("Employee", 120_000);

        List<Position> positions = new ArrayList<>();
        positions.add(boss);
        positions.add(jefe);
        positions.add(director);
        positions.add(manager);
        positions.add(employee);

        for(Position position : positions){
            if(position.getBonus() > 150_000){
                System.out.println(position.toString());
            }
        }
    }
}
