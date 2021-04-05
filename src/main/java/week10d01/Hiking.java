package week10d01;

import java.util.List;

public class Hiking {
    private List<Gps> gpslist;

    public Hiking(List<Gps> gpslist) {
        this.gpslist = gpslist;
    }

    public void addGps(Gps gps) {
        gpslist.add(gps);
    }

    public double getPlusElevation() {
        double sum = 0;
        for (int i = gpslist.size()-1; i > 0 ; i--){
            if(gpslist.get(i).getAltitude() > gpslist.get(i-1).getAltitude()){
                sum += gpslist.get(i).getAltitude() - gpslist.get(i-1).getAltitude();
            }
        }
        return sum;
    }

}
