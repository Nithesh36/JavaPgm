package javaRevise_coding;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        Integer [] ar={1,2,3,3,4,5,4,7};
//
//        Set<Integer> numbers = new LinkedHashSet<>(Arrays.asList((ar)));
//        System.out.println(numbers);

        //int duplicate
        int [] ar={1,2,3,4,9,2,5,7};
        Set<Integer> numbers = new LinkedHashSet<>();
//        numbers

        for(int ele:ar){
            numbers.add(ele);
        }
        System.out.println("after element got removed");
        System.out.println(numbers);
      //  System.out.println(ar[ar.length/2]);  //used for find a middle element
    }
}
