package isahasa.fleet;

public class FerryBoat implements Ship, CanCarryGoods, CanCarryPassengers {
    private CanCarryPassengers canCarryPassengers;
    private CanCarryGoods cancarryGoods;

    public FerryBoat(int maxPassengers, int maxCarryGoods) {
        this.canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
        this.cancarryGoods = new CanCarryGoodsBehaviour(maxCarryGoods);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return cancarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return cancarryGoods.getCargoWeight();
    }

    @Override
    public int loadPassenger(int passenger) {
        return canCarryPassengers.loadPassenger(passenger);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}
