package inheritanceconstructor.classroom;

public class Room {
    private String location;
    int capacity;

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public Room(String location, int capacity) {
        this.location = location;
        this.capacity = capacity;
    }
}
