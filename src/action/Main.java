package action;

import people.Cop;
import people.Fireman;
import people.Man;
import people.SimpleMan;
import transports.Bus;

/**
 * Created by Kate on 29.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();

        bus.setSeatsNumber(20);
        //Bus bus = new Bus();
        /*Cop cop = new Cop();
        SimpleMan simpleMan= new SimpleMan();
        Object[] act = {cop};
        int seats = 0;
        int freeseats = 30;
        for (int i=0; i<20; i++) {
            if ((bus.tr2 == act)) {
                seats++;
                freeseats--;
            }
        }
        System.out.println(seats);
        System.out.println(freeseats);*/

        /*int i = 0;
        Object[] r = genArrPiple(20);
        while (i < r.length) {
            System.out.print(i + ") ");
            System.out.println(r[i]);
            i++;
        }*/

        /*Object[] ar1 = {"zxc1", "zxc2", "zxc3", "zxc3"};
        Object[] ar2 = {"qwe1", "qwe2", "qwe1", "qwe2", "qwe1", "qwe2", "qwe2"};
        ArrayList<Object> arr = seatsInProcess(ar1, ar2);
        System.out.println(arr);*/
        /*while (i < arr.size()) {
            System.out.print(i + ") ");
            System.out.println(arr.get(i));
            i++;
        }*/
        Cop cop = new Cop();
        Fireman fireman = new Fireman();
        SimpleMan simpleMan = new SimpleMan();
        Helper helper = new Helper();
        cop.getTypeMan();
        fireman.getTypeMan();
        simpleMan.getTypeMan();

        Man[] allowedPeople = {simpleMan, cop, fireman};
        Man[] actualPeople = {fireman, simpleMan};
        System.out.println(helper.compareArrays(allowedPeople, actualPeople));
        //System.out.println(seatsInProcess(10, allowedPeople));
    }

}
