package inheritanceconstructor.cars;

public class Jeep extends Car {
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + extraCapacity - extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        if (extraFuel > 0) {
            if ((extraFuel + fuel) > 0) {
                extraFuel += fuel;
            } else {
                fuel += extraFuel;
                extraFuel = 0;
                super.modifyFuelAmount(fuel);
            }
        } else {
            super.modifyFuelAmount(fuel);
        }
    }

    @Override
    public void drive(int km) {
        if (km * super.getFuelRate() / 100 < super.getFuel() + extraFuel) {
            modifyFuelAmount(-((km * super.getFuelRate() / 100)));
            return;
        }
        throw new RuntimeException("Not enough fuel available!");
    }
}



