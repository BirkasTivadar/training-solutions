package methodparam;

public class Measurement {
    double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }

    public double[] getValues() {
        return values;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] > lower && values[i] < upper){
                return i;
            }
        }
        return -1;
    }

    public double minimum(){
        double min = values[0];
        for(double value : values){
            if(value<min){
                min = value;
            }
        }
        return min;
    }

    public double maximum(){
        double max = values[0];
        for(double value : values){
            if(value>max){
                max = value;
            }
        }
        return max;
    }

    public ExtremValues minmax(){
        return new ExtremValues(this.minimum(), this.maximum());
    }

}
