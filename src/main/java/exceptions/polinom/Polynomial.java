package exceptions.polinom;

public class Polynomial {

    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        if (coefficients == null) {
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficients) {
        if (coefficients == null) {
            throw new NullPointerException("coefficientStrs is null");
        }
        double[] coefficientsDouble = new double[coefficients.length];
        for (int i = 0; i < coefficients.length; i++) {
            try {
                coefficientsDouble[i] = Double.parseDouble(coefficients[i]);
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Illegal coefficients, not a number", nfe);
            }

        }
        this.coefficients = coefficientsDouble;
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[coefficients.length - (i + 1)] * Math.pow(x, i);
        }
        return result;
    }
}
