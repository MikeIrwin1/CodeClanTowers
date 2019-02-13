import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(13, 4, "Double");
    }

    @Test
    public void roomHasNumber(){
        assertEquals(13, bedroom.getNumber());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void roomHasType(){
        assertEquals("Double", bedroom.getType());
    }

}
