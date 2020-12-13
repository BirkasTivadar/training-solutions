package virtualmethod.vehicle;

public class FerryBoat extends Vehicle {
    private Car car;
    public static final int MAX_CARRY_WEIGHT = 2000;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    public boolean canCarry(Car car) {
        return car != null && car.getGrossLoad() < MAX_CARRY_WEIGHT;
    }

    public boolean load(Car car) {
        if (this.canCarry(car)) {
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + car.getGrossLoad();
    }

    public int getMAX_CARRY_WEIGHT() {
        return MAX_CARRY_WEIGHT;
    }

    public Car getCar() {
        return car;
    }

    public String toString() {
        return "FerryBoat{car=" + car.toString() + '}';
    }
}
