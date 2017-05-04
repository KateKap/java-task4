package transports;

import people.Cop;
import people.Fireman;
import people.SimpleMan;

import java.util.ArrayList;

/**
 * Created by Kate on 29.04.2017.
 */
public class Bus extends Transport {
    private ArrayList<Object> tr = new ArrayList<>();
    Cop cop = new Cop();
    SimpleMan simpleMan= new SimpleMan();
    Object[] tr2 = {cop, simpleMan};


}
