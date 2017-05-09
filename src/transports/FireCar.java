package transports;

import action.Helper;
import people.Cop;
import people.Fireman;
import people.Man;
import people.SimpleMan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kate on 29.04.2017.
 */
public class FireCar extends Car {
    private static final ArrayList<String> typePassAllowed = new ArrayList<String>(){{
        add("fireman");
    }};

    public ArrayList<String> getTypePassAllowed() {
        return typePassAllowed;
    }

    FireCar(CopCar ob) {
        super(ob);
    }

    public FireCar(){
        super();
    }

    public FireCar(int seats){
        super(seats);
    }

}
