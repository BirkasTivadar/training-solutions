package methodstructure.bmi;

public class BodyMass {

    public static final double LOWER_LIMIT = 18.5;
    public static final double UPPER_LIMIT = 25.0;

    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassindex() {
        return weight / (height * height);
    }

    public BmiCategory body() {
        if (bodyMassindex() < LOWER_LIMIT) {
            return BmiCategory.UNDERWEIGHT;
        } else if (bodyMassindex() <= UPPER_LIMIT) {
            return BmiCategory.NORMAL;
        } else {
            return BmiCategory.OVERWEIGHT;
        }
    }

    boolean isThinnerThan(BodyMass bodyMass) {
        return this.bodyMassindex() < bodyMass.bodyMassindex();
    }

}


