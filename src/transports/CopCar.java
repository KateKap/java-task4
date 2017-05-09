package transports;

import java.util.ArrayList;

/**
 * Created by Kate on 29.04.2017.
 */
public class CopCar extends Car {
    private static final ArrayList<String> typePassAllowed = new ArrayList<String>(){{
        add("cop");
    }};

    public ArrayList<String> getTypePassAllowed() {
        return typePassAllowed;
    }

    CopCar(CopCar ob) {
        super(ob);
    }

    public CopCar(){
        super();
    }

    public CopCar(int seats){
        super(seats);
    }
}
