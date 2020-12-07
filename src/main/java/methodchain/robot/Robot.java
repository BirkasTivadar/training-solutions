package methodchain.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private int distance;
    private int azimut;
    private List<NavigationPoint> navigationPointList = new ArrayList<>();


    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    public List<NavigationPoint> getNavigationPointList() {
        return navigationPointList;
    }

    public Robot setDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public Robot setAzimut(int azimut) {
        this.azimut = azimut;
        return this;
    }

    public Robot go(int meter) {
        this.distance += meter;
        return this;
    }

    public Robot rotate(int angle) {
        this.azimut += angle;
        return this;
    }

    public Robot registerNavigationPoint() {
        NavigationPoint navigationPoint = new NavigationPoint(getDistance(), getAzimut());
        navigationPointList.add(navigationPoint);
        return this;
    }


}
