package javaRevise_coding;

public class FibonaciSeries {
    public static void main(String[] args) {
        int range=50;
        int sum=0,a=0,b=1;
        System.out.print("0 1");
        for(int i=0;i<range;i++){

            sum=a+b;
            System.out.print(" "+sum+" ");
            a=b;
            b=sum;

        }
    }
}
// 0 1  1 2 3

// 1   a=b; (b=sum)