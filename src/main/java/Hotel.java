import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> vacantBedrooms;
    private ArrayList<Booking> bookings;
    private ArrayList<DiningRoom> dinings;
    private ArrayList<Conference> conferences;
    private HashMap<String, Integer> rates;

    public Hotel(ArrayList<Bedroom> vacantBedrooms, ArrayList<DiningRoom> dinings, ArrayList<Conference> conferences){

        this.vacantBedrooms = vacantBedrooms;
        this.bookings = new ArrayList<>();
        this.dinings = dinings;
        this.conferences = conferences;
        this.rates = getRates();

    }

    public ArrayList<Bedroom> getVacantBedrooms(){
        return this.vacantBedrooms;
    }

    public ArrayList<Booking> getbookings(){
        return this.bookings;
    }

    public ArrayList<DiningRoom> getDiningRooms(){
        return this.dinings;
    }

    public ArrayList<Conference> getConferenceRooms(){
        return this.conferences;
    }

    public int getNumberOfVacantBedrooms(){
        return this.vacantBedrooms.size();
    }

    public int getNumberOfbookings(){
        return this.bookings.size();
    }

    public int getTotalNumberOfRooms(){
        return getNumberOfbookings()+getNumberOfVacantBedrooms();
    }


    public int getNumberOfDiningRooms(){
        return this.dinings.size();
    }

    public int getNumberOfConferenceRooms(){
        return this.conferences.size();
    }


    public void checkInGuest(Guest guest1) {
        this.vacantBedrooms.get(0).addGuest(guest1);
    }

    public Booking bookRoom(int stayLength){
        Bedroom bedroom = this.getVacantBedrooms().remove(0);
        Booking booking = new Booking(bedroom, stayLength);
        this.bookings.add(booking);
        return booking;
    }

    public HashMap<String,Integer> getRates(){
        rates = new HashMap<>();
        rates.put("Single",50);
        rates.put("Twin", 70);
        rates.put("Double", 100);
        return rates;
    }

    public void giveRoomsRates(){
        for (Bedroom bedroom : this.vacantBedrooms){
            bedroom.addRate(this.rates.get(bedroom.getType()));
        }
    }
}
