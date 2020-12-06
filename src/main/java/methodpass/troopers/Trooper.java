package methodpass.troopers;

public class Trooper {
    private String name;

    private Position position;

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public Trooper(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        this.position = new Position(0, 0);
    }

    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("The new position must not be null");
        }
        this.position = new Position(target.getPosX(), target.getPosY());
    }

    public double distanceFrom(Position target) {
        return this.position.distanceFrom(target);
    }

}
