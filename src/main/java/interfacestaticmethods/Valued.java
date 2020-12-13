package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValued();

    static double totalValue(List<Valued> valueds) {
        double sum = 0;
        for (Valued valued : valueds) {
            sum += valued.getValued();
        }
        return sum;
    }
}
