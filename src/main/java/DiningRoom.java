import java.util.ArrayList;

public class DiningRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public DiningRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }
}
