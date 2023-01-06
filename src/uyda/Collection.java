package uyda;


import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Akobir");
        list.add("Sarvar");
        list.add("Sarvr2");
        list.add("Muhammad");
        list.add("X.Javoxir");

        List<String > lochin = new ArrayList<>();
        lochin.add("Zilola");
        lochin.add("Dilnura");
        lochin.add("Asila");
        lochin.add("Marjona");
        lochin.add("Lochin");
        list.addAll(lochin);


       list.set(1,"sarvar");
        System.out.println(list);
        getInfo(list);



    }
    public static void getInfo(List list){
        int tr = 0;
        for (int i = 0; i < list.size(); i++) {
            tr++;
            System.out.println(tr+" "+list.get(i));

        }
    }
}
