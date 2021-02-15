package x;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CanoeOffice {

    List<CanoeRental> canoeRentals = new ArrayList<>();

    public void addRental(CanoeRental canoeRental){
        canoeRentals.add(canoeRental);
    }

    public CanoeRental findRentalByName(String name){
        CanoeRental result;
        for(CanoeRental canoeRental : canoeRentals){
            if(canoeRental.getEndTime() == null && name.equals(canoeRental.getName())){
                return canoeRental;
            }
        }
        throw new IllegalArgumentException("Wrong name");
    }

    public void closeRentalByName(String name, LocalDateTime endTime){
        findRentalByName(name).setEndTime(endTime);
    }
}
