package javaRevise_coding;

public class MiniumElementArray {

    public static void main(String[] args) {
        int[] ar ={4,6,7,8,9,44,99};
        int max =Integer.MIN_VALUE;

        int secondMax =0;
        for (int j : ar) {
            if (j > max) {
                secondMax = max;
               // System.out.println("if secondMin: " + secondMax);
                max = j;
              //  System.out.println("if max: " + max);
            }
            //find a Second Min value
            else {
                secondMax = j;
              //  System.out.println("else SecondMin:      " + secondMax);
            }
        }
        System.out.println("maximum values: "+ max);
        System.out.println(secondMax);
    }

}
// 1 2 3
//ar[i]  a   ae[j]  2

// ar[i]>ar[j]
//temp=ar[i]
//ar[i]= ar[j]
//ar[i]=ar[j]
//ar[i]=temp