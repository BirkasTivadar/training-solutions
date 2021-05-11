package week16d01;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CanoeOffice {

    private List<CanoeRental> canoeRentals = new ArrayList<>();

    public List<CanoeRental> getCanoeRentals() {
        return new ArrayList<>(canoeRentals);
    }


    public void addRental(CanoeRental canoeRental) {
        canoeRentals.add(canoeRental);
    }


    public CanoeRental findRentalByName(String name) {

        for (CanoeRental canoeRental : canoeRentals) {
            if (canoeRental.getEndTime() == null && name.equals(canoeRental.getName())) {
                return canoeRental;
            }
        }

        throw new IllegalArgumentException("Wrong name");
    }


    public void closeRentalByName(String name, LocalDateTime endTime) {
        findRentalByName(name).setEndTime(endTime);
    }


    public double getRentalPriceByName(String name, LocalDateTime endTime) {

        CanoeRental canoe = findRentalByName(name);

        long hours = Duration.between(canoe.getStartTime(), endTime).toHours() + 1;

        return canoe.calculateRentalSum() * hours;
    }


    public List<CanoeRental> listClosedRentals() {
        return canoeRentals.stream().filter(e -> e.getEndTime() != null).sorted(Comparator.comparing(CanoeRental::getStartTime)).collect(Collectors.toList());
    }


    public Map<CanoeType, Long> countRentals() {
        return canoeRentals.stream().collect(Collectors.groupingBy(CanoeRental::getCanoeType, Collectors.counting()));
    }
}
