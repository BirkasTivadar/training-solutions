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

    void moveRobotTest

}