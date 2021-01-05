package week06d01;

public class SumPlusMinus {
    private double sumPozitives;
    private double sumNegatives;

    public SumPlusMinus(double sumPozitives, double sumNegatives) {
        this.sumPozitives = sumPozitives;
        this.sumNegatives = sumNegatives;
    }

    public double getSumPozitives() {
        return sumPozitives;
    }

    public double getSumNegatives() {
        return sumNegatives;
    }

    @Override
    public String toString() {
        return sumPozitives + " " + sumNegatives;
    }
}
