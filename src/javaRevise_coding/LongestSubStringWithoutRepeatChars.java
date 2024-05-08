package javaRevise_coding;

import java.util.*;

public class LongestSubStringWithoutRepeatChars {
  static String  longestSubstring="";
    static String subStr="";
    //vddfghm
  static LinkedHashMap<String,Integer>trackOfString=new LinkedHashMap<>();
  public static String  findLongestSubStringWithDistinct(){
      for (int i=0;i<subStr.length();i++){
          if(!trackOfString.containsKey(String.valueOf(subStr.charAt(i)))) {
              trackOfString.put(String.valueOf(subStr.charAt(i)), i);
              System.out.println("if");
          }
          else{
              i=trackOfString.get(String.valueOf(subStr.charAt(i)));

              trackOfString.clear();
              System.out.println(i +" :i");


          }
          if(trackOfString.keySet().toString().length()>longestSubstring.length())
              longestSubstring=trackOfString.keySet().toString();

      }
      return longestSubstring;
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a text to find longest substring");
        subStr = sc.nextLine();
        System.out.println(findLongestSubStringWithDistinct());

    }
}
