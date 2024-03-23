package Playing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitZeroInString {
    public static void main(String[] args) {
        String digits="3243444000";
          StringBuilder zero= new StringBuilder();
          StringBuilder nonZero= new StringBuilder();

//        zero=digits.replace("0","");
//        System.out.println( digits.length()-zero.length());
        for(int i=0;i<digits.length();i++){
          if(digits.charAt(i)=='0')
              zero.append(digits.charAt(i));
          else
              nonZero.append(digits.charAt(i));

        }
       digits= String.valueOf(zero .append(nonZero));
        System.out.println(digits );

    }
}
