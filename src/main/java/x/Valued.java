package x;

import java.util.List;

public interface Valued {

    double getValue();

    private static double sum(List<Valued> values){
        double sum = 0;
        for(Valued valued : values){
            sum += valued.getValue();
        }
        return sum;
    }

    static double totalValue(List<Valued> values){
        return sum(values);
    }
}

