package transports;

/**
 * Created by Kate on 29.04.2017.
 */
public class Car extends Transport {
    Car(Car ob) {
        super(ob);
    }

    public Car(){
        super();
    }

    public Car(int seats){
        super(seats);
    }
}
