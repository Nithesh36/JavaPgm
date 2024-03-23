package javaRevise_coding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubStringWithoutRepeatChars {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a text to find longest substring");
        String subStr = sc.nextLine();
        String longestOverAll = "";
        String longestCurrent = "";
        Set<Character> longestSubstr = new HashSet<>();
        for (int i = 0; i < subStr.length(); i++) {
            if (longestSubstr.contains(subStr.charAt(i))) {
                longestCurrent = "";
                longestSubstr.clear();
            }
                longestSubstr.add(subStr.charAt(i));
                longestCurrent = longestCurrent + subStr.charAt(i);
                if (longestCurrent.length() > longestOverAll.length())
                    longestOverAll = longestCurrent;


        }
        System.out.println(longestOverAll);
    }
}
