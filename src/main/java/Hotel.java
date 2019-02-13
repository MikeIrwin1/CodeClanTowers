import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> vacantBedrooms;
    private ArrayList<Bedroom> occupiedBedrooms;
    private ArrayList<DiningRoom> dinings;
    private ArrayList<Conference> conferences;

    public Hotel(ArrayList<Bedroom> vacantBedrooms, ArrayList<DiningRoom> dinings, ArrayList<Conference> conferences){

        this.vacantBedrooms = vacantBedrooms;
        this.occupiedBedrooms = new ArrayList<>();
        this.dinings = dinings;
        this.conferences = conferences;

    }

    public ArrayList<Bedroom> getVacantBedrooms(){
        return this.vacantBedrooms;
    }

    public ArrayList<Bedroom> getOccupiedBedrooms(){
        return this.occupiedBedrooms;
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

    public int getNumberOfOccupiedBedrooms(){
        return this.occupiedBedrooms.size();
    }

    public int getTotalNumberOfRooms(){
        return getNumberOfOccupiedBedrooms()+getNumberOfVacantBedrooms();
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
        this.occupiedBedrooms.add(bedroom);
        Booking booking = new Booking(bedroom, stayLength);
        return booking;
    }
}
