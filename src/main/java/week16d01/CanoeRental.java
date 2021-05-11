package week16d01;

import java.time.LocalDateTime;

public class CanoeRental {

    private static final int RENTAL_PRICE = 5000;

    private String name;

    private CanoeType canoeType;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    public CanoeRental(String name, CanoeType canoeType, LocalDateTime startTime) {
        this.name = name;
        this.canoeType = canoeType;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public CanoeType getCanoeType() {
        return canoeType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double calculateRentalSum() {
        return RENTAL_PRICE * canoeType.getMultiplier();
    }
}
