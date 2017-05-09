package transports;

import java.util.ArrayList;

/**
 * Created by Kate on 29.04.2017.
 */
public class Bus extends Transport {
    private static final ArrayList<String> typePassAllowed = new ArrayList<String>(){{
        add("cop");
        add("fireman");
        add("simpleMan");
    }};

    public ArrayList<String> getTypePassAllowed() {
        return typePassAllowed;
    }

    Bus(Bus ob) { // передача объекта конструктору
        super(ob);
        //typePassAllowed = ob.typePassAllowed;
    }
    public Bus(){
        super();
    }

    public Bus(int seats){
        super(seats);
    }
}
