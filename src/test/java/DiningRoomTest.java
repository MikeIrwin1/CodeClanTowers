import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom dining;

    @Before
    public void before(){
        dining = new DiningRoom(40, "Mess Hall");
    }

    @Test
    public void hasCapacity(){
        assertEquals(40, dining.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Mess Hall", dining.getName());
    }

}
