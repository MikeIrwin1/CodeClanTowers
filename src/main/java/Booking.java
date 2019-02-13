import java.util.ArrayList;

public class Booking {

    private Bedroom bedroom;
    private int stayLength;

    public Booking(Bedroom bedroom, int stayLength){
        this.bedroom = bedroom;
        this.stayLength = stayLength;
    }

    public Bedroom getBedroom(){
        return this.bedroom;
    }

    public int getStayLength(){
        return this.stayLength;
    }

    public int getBill(){
        return this.bedroom.getRate()*this.stayLength;
    }


}
