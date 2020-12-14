package week08d01;

public class Coordinate {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveLeft(){
        x--;
    }
     public void moveRight(){
        x++;
    }
     public void moveUp(){
        y++;
    }
     public void moveDown(){
        y--;
    }


}

