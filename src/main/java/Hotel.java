import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> dinings;
    private ArrayList<Conference> conferences;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<DiningRoom> dinings, ArrayList<Conference> conferences){

        this.bedrooms = bedrooms;
        this.dinings = dinings;
        this.conferences = conferences;

    }

    public ArrayList<Bedroom> getBedrooms(){
        return this.bedrooms;
    }

    public ArrayList<DiningRoom> getDiningRooms(){
        return this.dinings;
    }

    public ArrayList<Conference> getConferenceRooms(){
        return this.conferences;
    }

    public int getNumberOfBedrooms(){
        return this.bedrooms.size();
    }

    public int getNumberOfDiningRooms(){
        return this.dinings.size();
    }

    public int getNumberOfConferenceRooms(){
        return this.conferences.size();
    }


    public void checkInGuest(Guest guest1) {
        this.bedrooms.get(0).addGuest(guest1);
    }
}
