package javaRevise_coding;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        boolean isPrime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a number to check prime or not");
        int num=sc.nextInt();

        for(int i=2;i<num/2;i++){

            if(num%i==0){
             isPrime=false;
                 break;


            }

        }
        if(num==2) {

            System.out.println("prime number: "+num);

        }
     else  if(isPrime)
          System.out.println("Prime Number: "+num);
      else System.out.println("not a prime number : "+num);
    }
}
