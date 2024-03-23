package javaRevise_coding;

import java.util.*;
//https://leetcode.com/problems/shortest-completing-word/
public class ShortestCompleteWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 456";
        //1s3 456 2nd sc
        String[] words = {"looks","pest","stew","show"};
//        "step","steps","stripe","stepple"
        //"Man", "ptQsy", "pstsb", "steps", "aa", "sh", "pstws","pstNYY","psstWQkal"
        licensePlate = licensePlate.toLowerCase();
        ArrayList<String> ar = new ArrayList<>();
        ArrayList<String> shortWord = new ArrayList<>();
        Set<String> TwiceCharFind = new LinkedHashSet<>();
        String repeatChar = "";
        boolean flag = false;
        for (int i = 0; i < licensePlate.length(); i++) {
            //filter out only charters  (delete the digits)
            if (licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z') {
                ar.add(String.valueOf(licensePlate.charAt(i)));
                //find repeated charters
                if (!TwiceCharFind.add(String.valueOf(licensePlate.charAt(i)))) {
                    repeatChar = String.valueOf(licensePlate.charAt(i));
                }
            }
        }
        for (int k = 0; k < words.length; k++) {

            for (int m = 0; m < ar.size(); m++) {
                if (words[k].contains(ar.get(m))) {

                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                // System.out.println(repeatChar);
                //filter out Twice charter combination
                if (words[k].indexOf(repeatChar) != words[k].lastIndexOf(repeatChar)) {

                    shortWord.add(words[k]);
                }
            }
        }

        int minLen = shortWord.get(0).length();
        System.out.println(shortWord);
        String minPathStr = shortWord.get(0);
        //filter out min complete word(string has a min length)
        for (String ele : shortWord) {
            if (ele.length() < minLen) {
                minPathStr = ele;

                break;
            }
        }
        System.out.println(" Shortest Completing Word: "+minPathStr);
    }

}
