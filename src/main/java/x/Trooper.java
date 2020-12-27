package x;

public class Trooper {

    private String name;
    private Position position;

    public Trooper(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.position = new Position(0,0);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target){
        if(target == null){
            throw new IllegalArgumentException();
        }
        this.position = new Position(target.getPosX(), target.getPosY());
    }

    public double distanceFrom(Position target){
        return this.position.distanceFrom(target);
    }
}
