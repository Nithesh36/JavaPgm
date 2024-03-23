package javaRevise_coding;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {

        String myName="Nithesh";
        char[] name =myName.toCharArray();
        for (int i=0;i<name.length;i++){
            for (int j=i+1;j<name.length;j++){

            if(name[j]>name[i]){
                char temp=name[i];
                name[i]=name[j];
                name[j]=temp;
            }
            }
        }
      for (char nameChars:name){
          System.out.print(" "+(int)nameChars +" ");
      }
    }
}
