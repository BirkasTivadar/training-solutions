package x;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersonList) {
        Salesperson maxDifBelow = salespersonList.get(0);
        for (Salesperson salesperson : salespersonList) {
            if (salesperson.getDifferenceFromTarget() < maxDifBelow.getDifferenceFromTarget()) {
                maxDifBelow = salesperson;
            }
        }
        return maxDifBelow;
    }
}
