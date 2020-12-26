package x;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersonList) {
        Salesperson maxDifAbove = salespersonList.get(0);
        for (Salesperson salesperson : salespersonList) {
            if (salesperson.getDifferenceFromTarget() > maxDifAbove.getDifferenceFromTarget()) {
                maxDifAbove = salesperson;
            }
        }
        return maxDifAbove;
    }
}
