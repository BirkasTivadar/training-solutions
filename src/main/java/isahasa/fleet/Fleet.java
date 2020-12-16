package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> ships = new ArrayList<>();
    private int waitingPersons;
    private int waitingCargo;

    public Fleet(List<Ship> ships, int waitingPersons, int waitingCargo) {
        this.ships = ships;
        this.waitingPersons = waitingPersons;
        this.waitingCargo = waitingCargo;
    }

    public void loadShip(){
        for(Ship ship: ships){
            if(ship instanceof Liner){
                ((Liner)ship).loadPassenger(waitingPersons);
            }
            if(ship instanceof CargoShip){
                ((CargoShip)ship).loadCargo(waitingCargo);
            }
            if(ship instanceof FerryBoat){
                ((FerryBoat)ship).loadPassenger(waitingPersons);
                ((FerryBoat)ship).loadCargo(waitingCargo);
            }
        }
    }

    public List<Ship> getShips() {
        return ships;
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
