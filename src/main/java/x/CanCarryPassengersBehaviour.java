package x;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {
    private int passengers;
    private int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int remainPassengers = 0;
        if (passengers <= maxPassengers) {
            this.passengers = passengers;
        } else {
            this.passengers = maxPassengers;
            remainPassengers = passengers - maxPassengers;
        }
        return remainPassengers;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
