package action;

import people.Fireman;
import people.Man;
import transports.Transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kate on 09.05.2017.
 */
public class Helper {
    //ПОРІВНЯННЯ ДВОХ МАСИВІВ - МАСИВУ ІЗ ДОЗВОЛЕНИМ СПИСКОМ ОБ'ЄКТІВ ТА ВХІДНОГО НЕРОЗПОДІЛЕНОГО МАСИВУ
    public static ArrayList<Man> compareArrays(Man[] in, Man[] out) {
        ArrayList<Man> results = new ArrayList();
        for (Man person1 : in) {
            for (Man person2 : out) {
                if (person1.getTypeMan()==person2.getTypeMan()) {
                    results.add(person2);
                }
            }
        }
        return results;
    }

    //ФУНКЦІЯ ПОСАДКИ ПАСАЖИРІВ В ТРАНСПОРТ
    public static ArrayList<Object> seatsInProcess (Object[] peopleInCar, Object[] peopleOut){
        Transport tr = new Transport();
        List list = Arrays.asList(peopleInCar);
        ArrayList<Object> arrayList = new ArrayList<>(list);
        List list2 = Arrays.asList(peopleOut);
        ArrayList<Object> arrayList2 = new ArrayList<>(list2);
        int arrQ = arrayList2.size();
        int arrIn = arrayList.size();
        while (arrIn<tr.getSeatsNumber() & arrQ>0 ){
            arrayList.add(arrayList2.get(arrQ - 1));
            arrQ--;
            arrIn++;
        }
        return arrayList;
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


    //ФОРМУВАННЯ РАНДОМНОГО МАСИВУ ВХІДНОГО МАСИВУ ЛЮДІШОК
    //TODO - ДОПИСАТИ ДЛЯ ВСІХ ОБ'ЄКТІВ ЛЮДЕЙ
    static Object[] genArrPiple(int kl) {
        Fireman man = new Fireman();
        Fireman[] ar = new Fireman[kl];

        Arrays.fill(ar, man);
        return ar;

    }
}
