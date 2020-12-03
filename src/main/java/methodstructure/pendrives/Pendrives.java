package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives){
        Pendrive best = pendrives.get(0);
        for(Pendrive pendrive: pendrives){
            if(pendrive.pricePerCapacity() < best.pricePerCapacity()){
                best = pendrive;
            }
        }
        return best;
    }
    public Pendrive cheapest(List<Pendrive> pendrives){
        Pendrive cheapest = pendrives.get(0);
        for(Pendrive pendrive: pendrives){
            if(pendrive.cheaperThen(cheapest)){
                cheapest = pendrive;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity){
        for(Pendrive pendrive : pendrives){
            if(pendrive.getCapacity() == capacity){
                pendrive.risePrice(percent);
            }
        }
    }

}
