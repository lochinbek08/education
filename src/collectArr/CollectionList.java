package collectArr;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qizil");
        list.add("yashil");
        list.add("sariq");
        list.add("ko'k");
        list.add(1, "black");


        List<Integer> color=new ArrayList<>();
        color.add(12);
        color.add(29);
        color.add(19);
        color.add(100);
//        list.addAll(color);
        System.out.println(color);
        System.out.println(list);

        list.set(2, "yelow");
        getInfo(list);
    }

    public static void getInfo(java.util.List list) {
        int tr = 0;
        for (int i = 0; i < list.size(); i++) {
            tr++;
            System.out.println(tr + " " + list.get(i));

        }


    }

}
