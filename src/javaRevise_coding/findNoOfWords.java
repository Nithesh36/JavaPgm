package javaRevise_coding;

import java.util.Scanner;

public class findNoOfWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word to find length");
        String name=sc.nextLine();
//        int count=1;
//        for(int i=0;i<name.length()-1;i++){
//            if(name.charAt( i)==' ' && name.charAt(i+1)!=' ')
//                count++;
//            System.out.println("non Space "+name.charAt(i+1));
//        }
        System.out.println("words length : "+name.split("\\s+").length);

        // demo welcome de
    }
}
