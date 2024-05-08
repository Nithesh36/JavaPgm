package javaRevise_coding;

import java.util.*;


public class LinkedListDemo {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<Integer>(List.of(1,24,4,2));
        LinkedList<Integer>ls=new LinkedList<>(hs);
        LinkedList<Integer>addBy=new LinkedList<>();
        addBy.addAll(hs);
//        System.out.println(addBy);
        Collections.sort(ls,Collections.reverseOrder());
        ArrayList arrayList=new ArrayList<Integer>(List.of(9,9,92));
//        System.out.println(ls);
        boolean isSetConatin = hs.containsAll(arrayList);
//        System.out.println(!isSetConatin);
//        boolean isRemoveAll = hs.removeAll(ls);
//        System.out.println(isRemoveAll);
        System.out.println(hs.isEmpty() + " "+hs);
        Object[] objects = hs.toArray();
        Integer[] integers = hs.toArray(new Integer[hs.size()]);
      //  System.out.println(Arrays.toString(integers));
         Iterator<Integer>it= hs.iterator();
//        while(it.hasNext())
//            System.out.println(it.next());
        Object set = arrayList.set(1, 101);
        System.out.println(set +" "+arrayList);
        ls.set(1,3);
        Integer[] objects1 =  ls.toArray(integers);


        System.out.println("ar: "+ls);

//        List<Integer>Ls=new java.util.LinkedList<>();
//        Ls.add(99);
//        System.out.println(  Ls.remove(0)); //return removed element
//       Ls.clear();
        // ArrayList<String> ar=new ArrayList<>(Arrays.asList("DOb","Loc","Car"));
//        ar.add(1,"Raj");
//        System.out.println(ar);

      //  System.out.println(ar.contains("DOB"));
       // LinkedList <String> ls1=new LinkedList<>(ar);

     //  ListIterator<String>lsT= ls1.listIterator();

//       while (ar.listIterator().hasNext()){
//           System.out.println(ar.listIterator().next());
//       }
//        System.out.println(ls1);
    }
}
