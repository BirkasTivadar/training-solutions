package virtualmethod.vehicle;

public class FerryBoat extends Vehicle {
    public static final int MAX_CARRY_WEIGHT = 2000;

    private Car car = null;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public int getGrossLoad(){
        return super.getGrossLoad()+car.getGrossLoad();
    }

    public boolean canCarry(Car car){
        return car != null && car.getGrossLoad() < MAX_CARRY_WEIGHT;
    }

    public boolean load(Car car){
        if(canCarry(car)){
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return car instanceof Van ?
                "FerryBoat{car="+car.toString()+"}" :
                "FerryBoat{car="+car.toString()+"}";
    }
}
