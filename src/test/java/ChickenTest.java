import org.junit.*;

import static org.junit.Assert.*;

public class ChickenTest {
    Chicken c;

    @Before
    public void SetUp() throws Exception {
        c = new Chicken();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Cluck Cluck", c.sound());
    }



}
