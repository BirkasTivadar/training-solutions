package algorithmssum.sales;

import algorithmssum.sales.SalesAmountSumCalculator;
import algorithmssum.sales.Salesperson;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void sumSalesAmount() {
        SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();
        List<Salesperson> salespersons = Arrays.asList(
                new Salesperson("John", 600),
                new Salesperson("Bill", 200),
                new Salesperson("Kate", 700),
                new Salesperson("Mary", 700),
                new Salesperson("Karl", 200)
        );

        assertEquals(2400, salesAmountSumCalculator.sumSalesAmount(salespersons));
    }
}