package linkedList;

import java.util.LinkedList;

public class LinkedLIst {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Axror");
        linkedList.addFirst("Lochin");
        linkedList.addFirst("Shohjahon");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(2));
    }
}
