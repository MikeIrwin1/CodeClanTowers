import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private DiningRoom dining;
    private Conference conference1;
    private Conference conference2;
    private Guest guest1;
    private Guest guest2;

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> dinings;
    private ArrayList<Conference> conferences;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 4, "Double");
        bedroom2 = new Bedroom(2, 1, "Single");
        bedroom3 = new Bedroom(3, 2, "Twin");

        conference1 = new Conference("MacLaren Suite", 40);
        conference2 = new Conference("Renault Suite", 20);

        dining = new DiningRoom(60, "Mess Hall");

        bedrooms = new ArrayList<>();
        dinings = new ArrayList<>();
        conferences = new ArrayList<>();

        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);

        conferences.add(conference1);
        conferences.add(conference2);

        dinings.add(dining);

        hotel = new Hotel(bedrooms, dinings, conferences);

        guest1 = new Guest();
        guest2 = new Guest();

    }

    @Test
    public void hotelHasBedrooms(){
        assertEquals(3,hotel.getNumberOfBedrooms());
    }

    @Test
    public void hotelHasConferenceRooms(){
        assertEquals(2, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void hotelHasDiningRooms(){
        assertEquals(1, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void hotelCanCheckInGuests(){
        hotel.checkInGuest(guest1);
        assertEquals(1,hotel.getBedrooms().get(0).getNumberOfGuests());
    }



}
