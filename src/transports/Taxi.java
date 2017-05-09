package transports;

import java.util.ArrayList;

/**
 * Created by Kate on 29.04.2017.
 */
public class Taxi extends Car {
    private static final ArrayList<String> typePassAllowed = new ArrayList<String>(){{
        add("cop");
        add("fireman");
        add("simpleMan");
    }};

    public ArrayList<String> getTypePassAllowed() {
        return typePassAllowed;
    }

    Taxi(CopCar ob) {
        super(ob);
    }

    public Taxi(){
        super();
    }

    public Taxi(int seats){
        super(seats);
    }
}
