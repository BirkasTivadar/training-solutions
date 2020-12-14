package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void createRobotTest() {
        Robot robot = new Robot();
        assertEquals(0, robot.getCoordinate().getX());
        assertEquals(0, robot.getCoordinate().getY());
    }

    @Test
    void moveRobotTest() {
        Robot robot = new Robot();
        String order = "FFLLLLLBBBBJJJJJJJ";
        robot.move(order);
        assertEquals(3, robot.getCoordinate().getX());
        assertEquals(-3, robot.getCoordinate().getY());
    }


}