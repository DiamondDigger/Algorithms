package by.mustWork_01;

import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        List<String> reverseList = new LinkedList<String>();

        System.out.println("list before filling : " + list);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println("list after setting : " + list);

        System.out.println(list.size());


        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("listIterator:" + iterator.next() );
        }
        System.out.println("######## Reverse");
        while (iterator.hasPrevious()){
            String previous = iterator.previous();
            reverseList.add(previous);
            System.out.println("listIterator:" + previous );
        }
        System.out.println("reverseList = " + reverseList);
    }
}