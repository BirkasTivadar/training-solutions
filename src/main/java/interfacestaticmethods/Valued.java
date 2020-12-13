package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValue();

    static double sumValues(List<Valued> valueds){
       double sum = 0;
       for(Valued valued : valueds){
           sum += valued.getValue();
       }
       return sum;
    }
}
