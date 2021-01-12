package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private List<Ride> rides = new ArrayList<>(

    );

    public List<Ride> getRides() {
        return rides;
    }

    public int checkDays() {
        for (int i = 0; i < rides.size() - 1; i++) {
            if (rides.get(i + 1).getDay() - rides.get(i).getDay() > 1) {
                return rides.get(i).getDay() + 1;
            }
        }
        if (rides.get(rides.size() - 1).getDay() < 7) {
            return rides.get(rides.size() - 1).getDay() + 1;
        }
        return -1;
    }

    public void addRide(Ride ride) {
        if (rides.size() < 1 || isSmallerThan(ride)) {
            rides.add(ride);
        } else throw new IllegalArgumentException("wrong Ride...");
    }

    public boolean isSmallerThan(Ride ride) {
        Ride lastRide = rides.get(rides.size() - 1);
        if (lastRide.getDay() > ride.getDay()) {
            return false;
        }
        if (rides.get(rides.size() - 1).getDay() == ride.getDay()) {
            if (ride.getRideId() - lastRide.getRideId() != 1) {
                return false;
            }
        }
        return true;
    }

}
