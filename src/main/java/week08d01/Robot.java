package week08d01;

import java.util.Arrays;
import java.util.List;

public class Robot {

    public static final List<Character> CHARS_OF_ORDER = Arrays.asList('B', 'F', 'L', 'J');

    private Coordinate coordinate = new Coordinate(0,0);

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public boolean isOrder(String str){
        for(int i=0; i<str.length(); i++){
            if(!CHARS_OF_ORDER.contains(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public Coordinate move(String orders){
        if(!isOrder(orders)){
            throw new IllegalArgumentException("Invalid order.");
        }
        for(int i= 0; i<orders.length(); i++){
            if(orders.charAt(i) == 'B'){
                coordinate.moveLeft();
            }
            if(orders.charAt(i) == 'F'){
                coordinate.moveUp();
            }
            if(orders.charAt(i) == 'L'){
                coordinate.moveDown();
            }
            if(orders.charAt(i) == 'J'){
                coordinate.moveRight();
            }
        }
        return coordinate;
    }
}
