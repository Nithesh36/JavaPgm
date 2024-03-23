package javaRevise_coding;

import java.util.HashMap;
import java.util.Map;

public class findNonRepeatedIntegrArray {


    public static void main(String[] args) {
        int[] ar = {1,2,3,2,4,6,4};
        Map<Integer,Integer> findUniqueElementMap=new HashMap<>();
        for(int ele:ar){
            if(findUniqueElementMap.containsKey(ele))
                findUniqueElementMap.put(ele,findUniqueElementMap.get(ele)+1);
            else
                findUniqueElementMap.put(ele,1);

        }
        for (Map.Entry<Integer,Integer> uniquEle:findUniqueElementMap.entrySet())
            if(uniquEle.getValue()<2)
                 System.out.print(" "+findUniqueElementMap+" ");


    }

}
