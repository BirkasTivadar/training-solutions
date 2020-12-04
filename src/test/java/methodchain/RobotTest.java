package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    public void testGoAndRotate() {
        Robot robot = new Robot();
        robot.go(5).go(10).rotate(30);
        assertEquals(15, robot.getDistance());
        assertEquals(30, robot.getAzimut());
    }

    @Test
    public void testRotate() {
        Robot robot = new Robot();
        robot.rotate(45).rotate(45).rotate(-90);
        assertEquals(0, robot.getAzimut());
    }

}