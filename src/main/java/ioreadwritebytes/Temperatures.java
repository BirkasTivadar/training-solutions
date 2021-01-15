package ioreadwritebytes;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double sum = 0;
        for (byte temperatureOfOneDay : data) {
            sum += temperatureOfOneDay;
        }
        return sum / data.length;
    }

    public double getMonthAverage() {
        double sum = 0;
        for (int i = data.length - 30; i < data.length; i++) {
            sum += data[i];
        }
        return sum / 30;
    }
}
