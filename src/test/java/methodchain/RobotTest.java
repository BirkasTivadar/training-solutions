package methodchain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    private Robot robot;

    @BeforeEach
    public void setUp() {
        this.robot = new Robot();
    }

    @AfterEach
    public void tearDown() {
        this.robot = null;
    }

    @Test
    public void testGoAndRotate() {
        robot.go(5).go(10).rotate(30);
        assertEquals(15, robot.getDistance());
        assertEquals(30, robot.getAzimut());
    }

    @Test
    public void testRotate() {
        robot.rotate(45).rotate(45).rotate(-90);
        assertEquals(0, robot.getAzimut());
    }

    @Test
    public void testNavigationChain() {
        robot.go(5).rotate(45).registerNavigationPoint().go(10).rotate(-15).registerNavigationPoint();
        assertEquals("[distance: 5 azimut: 45, distance: 15 azimut: 30]", robot.getNavigationPointList().toString());
    }

}