package statements;

public class Investment {

    private double cost = 0.003;

    private int fund;

    private int interestRate;

    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return (fund * interestRate / 100.0 / 365 * days);
    }

    public double close(int days) {
        double closeAmount = active ? fund + this.getYield(days) - getCloseCost(days) : 0;
        active = false;
        return closeAmount;
    }

    private double getCloseCost(int days) {
        return (fund + this.getYield(days)) * cost;
    }


}

