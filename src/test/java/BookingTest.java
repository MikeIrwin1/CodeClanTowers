import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){

        bedroom = new Bedroom(12, 2, "Twin");
        bedroom.addRate(70);
        booking = new Booking( bedroom, 2);

    }

    @Test
    public void bookingHasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void bookingHasStayLength(){
        assertEquals(2, booking.getStayLength());
    }

    @Test
    public void bookingTotalBill(){
        assertEquals(140, booking.getBill());
    }

}
