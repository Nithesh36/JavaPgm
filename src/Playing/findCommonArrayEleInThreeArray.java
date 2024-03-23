package Playing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findCommonArrayEleInThreeArray {

    public static void main(String[] args) {
        System.out.println("Hello peter");
        Integer[]ar1={1,23,4,5,2,3};
        Integer[]ar2={1,23,41,51,2,31};
        Integer[]ar3={23,2,52,62,72,82};
//        int i=0,index=0;
//        boolean isit=true;
//        while(isit)
//        {
//            if(index==ar1.length-1)isit=false;
//            else if (ar1[index]==ar2[i]){
//            }
//            else if(ar1[index]==ar3[i])
//            {
//            }
//            else{index++;}
//        }
        List<Integer> ls1=Arrays.asList(ar1);
        List<Integer> ls2=Arrays.asList(ar2);
        List<Integer> ls3=Arrays.asList(ar3);

        for(Integer i: ls1)
        {
            if(ls2.contains(i)&&ls3.contains(i)) System.out.println("common detected ::"+i);
        }
    }
}
