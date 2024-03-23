package Playing;

import java.util.*;

interface  demo{
     int d=1;
}
public class StringsDemo {
    static String name = "Nit";

    public static void main(String[] args) {
        name = name.toLowerCase();
        StringBuffer setStr = new StringBuffer(name);

//        System.out.println(setStr.length());
//        setStr.setCharAt(2,'W');
//        System.out.println("       m   d   ");

        // System.out.println(setStr.replace(0,name.length(),"wel"));

//        setStr.insert(0,'Q');
//sort method Default will sort in ascending order
        // Create a LinkedList of integers
//        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(4, 1, 3));
//
//        // Sort the LinkedList using Collections.sort  Descending
//        linkedList.sort(Collections.reverseOrder());
//
//        System.out.println(Collections.min(linkedList));
//        int[] arr = {1, 3, 4};
//
//        // Sort the array using Arrays.sort
//        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));

        System.out.println(demo.d);
    }
}
