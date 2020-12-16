package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {

    private int cargoWeight;

    private int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int remainder = 0;
        if (cargoWeight < maxCargoWeight) {
            this.cargoWeight = cargoWeight;
        } else {
            this.cargoWeight = maxCargoWeight;
            remainder = cargoWeight - this.cargoWeight;
        }
        return remainder;
    }

    @Override
    public int getCargoWieght() {
        return cargoWeight;
    }
}
