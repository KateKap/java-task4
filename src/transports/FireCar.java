package transports;

import people.Cop;
import people.Fireman;
import people.SimpleMan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kate on 29.04.2017.
 */
public class FireCar extends Car {
    protected static int SEATSNUM = 8;
    Object[] peopleInCar = {};

    //ФУНКЦІЯ МЕЙН
    public static void main(String[] args){

        int i = 0;
        /*Object[] r = genArrPiple(20);
        while (i < r.length) {
            System.out.print(i + ") ");
            System.out.println(r[i]);
            i++;
        }*/

        Object[] ar1 = {"zxc1", "zxc2", "zxc3", "zxc3"};
        Object[] ar2 = {"qwe1", "qwe2", "qwe1", "qwe2", "qwe1", "qwe2", "qwe2"};
        ArrayList<Object> arr = seatsInProcess(ar1, ar2);
        System.out.println(arr);
        /*while (i < arr.size()) {
            System.out.print(i + ") ");
            System.out.println(arr.get(i));
            i++;
        }*/





        Cop cop = new Cop();
        Fireman fireman = new Fireman();
        SimpleMan simpleMan = new SimpleMan();

        Object[] allowedPeople = {cop, simpleMan, fireman};
        Object[] actualPeople = {fireman, cop, simpleMan};
        ArrayList<Object> arr0 = compareArrays(allowedPeople, actualPeople);
        System.out.println(arr0);
        //System.out.println(seatsInProcess(10, allowedPeople));
    }

    //ПОРІВНЯННЯ ДВОХ МАСИВІВ - МАСИВУ ІЗ ДОЗВОЛЕНИМ СПИСКОМ ОБ'ЄКТІВ ТА ВХІДНОГО НЕРОЗПОДІЛЕНОГО МАСИВУ
    //TODO - ОТРИМАТИ ВІДФІЛЬТРОВАНИЙ МАСИВ!!!
    public static ArrayList<Object> compareArrays(Object[] in, Object[] out) {
        List list = Arrays.asList(in);
        ArrayList<Object> arrayListAllowed = new ArrayList<>(list);
        List list2 = Arrays.asList(out);
        ArrayList<Object> arrayListPresent = new ArrayList<>(list2);
        ArrayList<Object> peopleOutFiltered = new ArrayList<>();
        for (int i = 0; i < arrayListAllowed.size()-1; i++) {
            for (int j = 0; j < arrayListPresent.size()-1; j++) {
                /*if (Arrays.asList(b).contains(Arrays.asList(a))){
                    bool = true;
                }*/
                //if (arrayListPresent.size() <= arrayListAllowed.size()) {
                    if (!(arrayListPresent.get(j).equals(arrayListAllowed.get(i)))) {
                        arrayListPresent.remove(arrayListPresent.get(j));
                    }
                //}
            }
        }
        return arrayListPresent;
    }

    //ФУНКЦІЯ ПОСАДКИ ПАСАЖИРІВ В ТРАНСПОРТ
    public static ArrayList<Object> seatsInProcess (Object[] peopleInCar, Object[] peopleOut){
        List list = Arrays.asList(peopleInCar);
        ArrayList<Object> arrayList = new ArrayList<>(list);
        List list2 = Arrays.asList(peopleOut);
        ArrayList<Object> arrayList2 = new ArrayList<>(list2);
        int arrQ = arrayList2.size();
        int arrIn = arrayList.size();
            while (arrIn<SEATSNUM & arrQ>0 ){
                arrayList.add(arrayList2.get(arrQ - 1));
                //Arrays.fill(peopleInCar, peopleOut[arrQ - 1]);
                arrQ--;
                arrIn++;
            }
        return arrayList;

        /*int lengthPeopleOut = peopleOut.length; //2
        int lengthPeopleInCar = peopleInCar.length;
        Object[] boofarr = {};
        for (int i=0; i<SEATSNUM; i++) {
            while (((SEATSNUM - lengthPeopleInCar) > 0) | lengthPeopleOut == 0) {
                boofarr[i] = peopleOut[lengthPeopleOut - 1];
                //Arrays.fill(peopleInCar, peopleOut[lengthPeopleOut - 1]);
                lengthPeopleOut--;
            }
        }
        Object[] r = new Object[peopleInCar.length + boofarr.length];
        System.arraycopy(peopleInCar, 0, r, 0, peopleInCar.length);
        System.arraycopy(boofarr, 0, r, peopleInCar.length, boofarr.length);
        return  r;*/
    }

    //ФУНКЦІЯ ВИСАДКИ ПАСАЖИРІВ З ТРАНСПОРТУ
    public static ArrayList<Object> seatsOutProcess (Object[] peopleInCar, Object[] peopleOut) {
        List list = Arrays.asList(peopleInCar);
        ArrayList<Object> arrayList = new ArrayList<>(list);
        List list2 = Arrays.asList(peopleOut);
        ArrayList<Object> arrayList2 = new ArrayList<>(list2);
        int arrQ = arrayList2.size();
        int arrIn = arrayList.size();
        while (arrIn > 0) {
            arrayList.add(arrayList2.get(arrQ - 1));
            //Arrays.fill(peopleInCar, peopleOut[arrQ - 1]);
            arrQ++;
            arrIn--;
        }
        return arrayList;
    }

    /*
    public static int seatsOutProcess (int qOccupied, int qFree, Object[] arrGoOut){
        int arrQ = arrGoOut.length;
        for (int i=0; i<arrQ; i++){
            while (qOccupied>0 & arrQ>0 ){
                arrQ++;
                qFree++;
            }
            break;
        }
        return  qFree;
    }*/


    //ФОРМУВАННЯ РАНДОМНОГО МАСИВУ ВХІДНОГО МАСИВУ ЛЮДІШОК
    //TODO - ДОПИСАТИ ДЛЯ ВСІХ ОБ'ЄКТІВ ЛЮДЕЙ
    static Object[] genArrPiple(int kl) {
        Fireman man = new Fireman();
        Fireman[] ar = new Fireman[kl];

        Arrays.fill(ar, man);
        return ar;

    }
}
