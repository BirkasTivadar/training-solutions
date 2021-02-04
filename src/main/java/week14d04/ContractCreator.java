package week14d04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContractCreator {

    private Contract contract;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
        this.contract = new Contract(client, monthlyPrices);
    }

    public Contract create(String name) {
        return new Contract(name, new ArrayList<>(contract.getMonthlyPrices()));
    }

    public static void main(String[] args) {
        ContractCreator contractCreator = new ContractCreator("José", new ArrayList<>(Arrays.asList(23, 45, 67)));
        Contract contractTest = contractCreator.create("Diego");

        contractTest.getMonthlyPrices().set(2, 76);
        System.out.println(contractCreator.contract.getMonthlyPrices().get(2));
        System.out.println(contractTest.getMonthlyPrices().get(2));
    }
}
