package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        if(trooper == null){
            throw new IllegalArgumentException();
        }
        troopers.add(trooper);
    }

    public findTrooperByName
}
