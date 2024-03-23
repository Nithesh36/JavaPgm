package javaRevise_coding;

import java.util.Arrays;

public class LongestPrefixFindString {
    public static void main(String[] args) {
        String[] prefixArray ={"apple", "app", "appGet", "appRec"};

        Arrays.sort(prefixArray);
        System.out.println("sorted: "+ Arrays.toString(prefixArray));
        StringBuilder commonPrefix=new StringBuilder();
        int ind=0;
        int end=0;
        /* find the minimum length from first and last string */
       if(prefixArray[0].length()<prefixArray[prefixArray.length-1].length())
           end=prefixArray[0].length();
       else
           end=prefixArray[prefixArray.length-1].length();

        /* find the common prefix between the first and
           last string */
        while (ind< end && prefixArray[0].charAt(ind) == prefixArray[prefixArray.length-1].charAt(ind) )
            ind++;
         commonPrefix.append(prefixArray[prefixArray.length-1], 0, ind);

        System.out.println(commonPrefix);
    }
}
