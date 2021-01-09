package x;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private int waitingPersons;
    private int waitingCargo;

    private List<Ship> ships = new ArrayList<>();

    public void addShip(Ship ship){
        ships.add(ship);
    }

    public void loadShip(int passengers, int cargoWeight){
        int remainPassengers = passengers;
        int remainCargo = cargoWeight;
        for(Ship ship : ships){
            if(ship instanceof CanCarryPassengers){
               remainPassengers = ((CanCarryPassengers) ship).loadPassenger(remainPassengers);
            }
            if (ship instanceof CanCarryGoods) {
               remainCargo = ((CanCarryGoods) ship).loadCargo(remainCargo);
            }
        }
        waitingPersons = remainPassengers;
        waitingCargo = remainCargo;
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
