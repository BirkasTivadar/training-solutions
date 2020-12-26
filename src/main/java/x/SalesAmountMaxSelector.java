package x;


import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersonList){
        Salesperson maxSales = salespersonList.get(0);
        for(Salesperson salesperson : salespersonList){
            if(salesperson.getAmount() > maxSales.getAmount()){
                maxSales = salesperson;
            }
        }
        return maxSales;
    }
}
