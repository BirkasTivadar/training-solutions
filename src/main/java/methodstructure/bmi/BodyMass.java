package methodstructure.bmi;

public class BodyMass {
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

    public double bodyMassindex(){
        return weight / (height*height);
    }

    public BmiCategory body(){
        if(bodyMassindex() <18.5){
            return BmiCategory.UNDERWEIGHT;
        } else if( bodyMassindex() <=25){
            return BmiCategory.NORMAL;
        } else {
            return BmiCategory.OVERWEIGHT;
        }
    }

    boolean isThinnerThan(BodyMass bodyMass){
        return this.bodyMassindex() < bodyMass.bodyMassindex();
    }

}


