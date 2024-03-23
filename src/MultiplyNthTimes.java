import java.util.Scanner;

public class MultiplyNthTimes {
    public static void main(String[] args) {
        long count = 0;
        long num = 0;
        long rem = 0;
        long armstrong = 0;
        long orginalNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find armstrong or not");
        num = sc.nextLong();
        orginalNum = num;
        count = String.valueOf(orginalNum).length();

        while (num != 0 &num>0) {
            //find last digits by cutting down
            rem = num % 10; //reminder will come
            long temp1 = 1;

            for (int i = 0; i < count; i++) {
                System.out.println("before squares: "+temp1);
                temp1 = rem * temp1;
                System.out.println("squares: "+temp1);
            }
            armstrong = armstrong + temp1;
            //cut down the numbers
            num /= 10;//quotient will come

        }
        if (orginalNum == armstrong) System.out.println("armstrong number:" + armstrong);

        else System.out.println("not armstrong number:" + orginalNum);

    }


}
