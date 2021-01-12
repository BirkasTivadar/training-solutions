package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return rides;
    }

    public int checkDays() {
        if(rides.size() < 1){
            return 1;
        }
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
        if (isRigthRide(ride)) {
            rides.add(ride);
        } else throw new IllegalArgumentException("Wrong ride.");
    }


    private boolean isRigthRide(Ride ride) {
        if (rides.size() < 1) {
            if (ride.getDay() == 1 && ride.getRideId() == 1) {
                return true;
            } else {
                return false;
            }
        }
        if (rides.get(rides.size() - 1).getDay() > ride.getDay()) {
            return false;
        }
        if (rides.get(rides.size() - 1).getDay() == ride.getDay()) {
            if ((ride.getRideId() - rides.get(rides.size() - 1).getRideId()) != 1) {
                return false;
            }
        }
        if (ride.getRideId() != 1) {
            return false;
        }
        return true;
    }
}
