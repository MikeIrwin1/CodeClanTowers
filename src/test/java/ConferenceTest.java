import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private Conference conference;

    @Before
    public void before(){
        conference = new Conference("MacLaren Suite", 40);
    }

    @Test
    public void canGetName(){
        assertEquals("MacLaren Suite", conference.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(40, conference.getCapacity());
    }

    @Test
    public void canGetNumberOfGuests(){
        assertEquals(0, conference.getNumberOfGuests());
    }


}
