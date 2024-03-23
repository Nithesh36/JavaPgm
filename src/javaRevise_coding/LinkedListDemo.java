package javaRevise_coding;

import java.util.*;


public class LinkedListDemo {
    public static void main(String[] args) {
//        List<Integer>Ls=new java.util.LinkedList<>();
//        Ls.add(99);
//        System.out.println(  Ls.remove(0)); //return removed element
//       Ls.clear();
        ArrayList<String> ar=new ArrayList<>(Arrays.asList("DOb","Loc","Car"));
//        ar.add(1,"Raj");
//        System.out.println(ar);

      //  System.out.println(ar.contains("DOB"));
        LinkedList <String> ls1=new LinkedList<>(ar);

       ListIterator<String>lsT= ls1.listIterator();

       while (ar.listIterator().hasNext()){
           System.out.println(ar.listIterator().next());
       }
//        System.out.println(ls1);
    }
}
