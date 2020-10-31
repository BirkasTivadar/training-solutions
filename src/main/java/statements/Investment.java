package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int day) {
        return (fund*interestRate/100.0/365*day);
    }

    public double close(int day) {
        if(active){
            active = false;
            return (fund + this.getYield(day))*0.997;
        } else {
            return 0;
        }
    }



}

