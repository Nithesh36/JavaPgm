package javaRevise_coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPracr {
    public static void main(String[] args) {
        int[] ar={1,2,3};
        String []data={"s"};
        List<Integer>ls=new ArrayList<>();

        ls.add(6);
        ls.add(7);
//return removed element
       // ls.remove(0);
//update a value
      //  ls.set(9,12); //index,value
       ls.add(0,99);

        System.out.println(ls);
        //ls.remove(object) return true
        System.out.println("removed: "+   ls.remove(Integer.valueOf(7)));  //remove elemeent specified

        //after removal
        System.out.println("after removal");
        System.out.println(ls);

        System.out.println(ls.remove(1)); //return removed element
        System.out.println( "conatins:  "+ls.contains(99)); //return boolean value
    // return  int possiton  or -1
        System.out.println(ls.indexOf(901)) ;
        System.out.println("ls array: "+Arrays.toString(ls.toArray()));
        System.out.println("");
//        new LinkedList<>().listIterator().previous();


    }
}
