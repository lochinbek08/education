package map;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer,String>map=new HashMap<>();
        map.put(1,"Loc");
        map.put(2,"Axxi");
        map.put(3,"Shoh");
        map.put(4,"lao");
        System.out.println(map.get(2));
        System.out.println(map.get(3));

          map.remove(3);
          System.out.println(map.containsKey(3));
          System.out.println(map.replace(1, "salom"));
          System.out.println(map.hashCode());
          System.out.println(map.size());
          System.out.println(map);
    }
}
