package week08d01;

import java.util.Arrays;
import java.util.List;

public class Robot {

    public static final List<Character> CHARS_OF_ORDER = Arrays.asList('B', 'F', 'L', 'J');

    private Coordinate coordinate = new Coordinate(0, 0);

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Coordinate move(String orders) {
        for (int i = 0; i < orders.length(); i++) {
            oneMoveStep(orders.charAt(i));
            System.out.println(this.toString());
        }
        return coordinate;
    }

    private void oneMoveStep(Character letter) {
        switch (letter) {
            case 'B':
                coordinate.moveLeft();
                return;
            case 'F':
                coordinate.moveUp();
                return;
            case 'L':
                coordinate.moveDown();
                return;
            case 'J':
                coordinate.moveRight();
                return;
            default:
                throw new IllegalArgumentException("Invalid order.");
        }
    }

    public String toString(){
        return "Robot is in x:"+coordinate.getX() +", y:"+coordinate.getY();
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.move("BFBJBLL");

    }

}
