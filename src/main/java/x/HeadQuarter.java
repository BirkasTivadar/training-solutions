package x;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException();
        }
        troopers.add(trooper);
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper trooper : troopers) {
            if (name.equals(trooper.getName())) {
                return trooper;
            }
        }
        throw new IllegalArgumentException("Wrong name");
    }

    private Trooper findClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException();
        }
        Trooper closest = troopers.get(0);
        for (Trooper trooper : troopers) {
            if (trooper.distanceFrom(target) < closest.distanceFrom(target)) {
                closest = trooper;
            }
        }
        return closest;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    public void moveTrooperByName(String name, Position target) {
        moveTrooper(findTrooperByName(name), target);
    }

    public void moveClosestTrooper(Position target) {
        moveTrooper(findClosestTrooper(target), target);
    }

}
