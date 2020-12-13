package virtualmethod.vehicle;

public class FerryBoat {

    public final int MAX_CARRY_WEIGHT;
    private Car car = null;

    public FerryBoat(int max) {
        MAX_CARRY_WEIGHT = max;
    }

    public boolean canCarry(Car car) {
        return car.getGrossLoad() < MAX_CARRY_WEIGHT;
    }

    public boolean load(Car car) {
        if(this.canCarry(car)){
            this.car = car;
            return true;
        }
        return false;
    }

    public int getMAX_CARRY_WEIGHT() {
        return MAX_CARRY_WEIGHT;
    }

    public Car getCar() {
        return car;
    }
}
