import java.util.ArrayList;

public class Conference {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public Conference(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }


}
