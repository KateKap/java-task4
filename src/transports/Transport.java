package transports;

import java.util.ArrayList;

/**
 * Created by Kate on 29.04.2017.
 */
public class Transport {
        private String name;
        private ArrayList<String> typePassAllowed;
        private int seatsNumber;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<String> getTypePassAllowed() {
        return typePassAllowed;
    }

    public void setTypePassAllowed(ArrayList<String> typePassAllowed){
        this.typePassAllowed = typePassAllowed;
    }

    public int getSeatsNumber() {
        return seatsNumber;

    }

    public void setSeatsNumber(int seatsNumber){
        this.seatsNumber = seatsNumber;
    }

    Transport(Transport ob) { // передача объекта конструктору
        name = ob.name;
        seatsNumber = ob.seatsNumber;
    }

    public Transport (){

    }

    public Transport(int seats){
        seatsNumber = seats;
    }


}

