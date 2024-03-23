package javaRevise_coding;

public class ReverseNumbers {
    public static void main(String[] args) {

        int num=987;
        int ReveresedNumber=0;
        while(num>0){
            System.out.println(ReveresedNumber*10 +"   reversed num");
            ReveresedNumber=(ReveresedNumber *10)+num%10;
            System.out.println(ReveresedNumber+"   reversed num reverse");

            num=num/10;
        }

        System.out.println("after reversed: "+ReveresedNumber);
    }
}
