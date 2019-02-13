import java.util.ArrayList;

public class Bedroom {

    private int number;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int rate;


    public Bedroom(int number, int capacity, String type){
        this.number = number;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<>();
    }

    public int getNumber(){
        return this.number;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }

    public int getRate(){
        return this.rate;
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void addRate(int rate){
        this.rate = rate;
    }



}
