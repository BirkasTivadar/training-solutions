package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{
    int passengers;
    int maxPassengers;

    @Override
    public int loadPassenger(int passengers) {
        int remainPassengers =0;
        if(passengers < maxPassengers){
            this.passengers = passengers;
        } else {
            this.passengers = maxPassengers;
            remainPassengers = passengers - this.passengers;
        }
        return remainPassengers;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
