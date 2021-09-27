import org.junit.*;

import static org.junit.Assert.*;


public class VehicleTest {
    Vehicle v;

    @Before
    public void setUp() throws Exception {
        v = new Vehicle();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(2, v.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        v.upgradeSpeed();
        assertEquals(4, v.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        v.downgradeSpeed();
        assertEquals(0, v.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20, v.getPrice());
    }

}