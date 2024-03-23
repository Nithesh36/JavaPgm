import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number to find prime or not");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num == 0 || num == 1) {
            System.out.println("non prime: " + num);
            isPrime = false;
        }

        for (int i = 2; i < (num / 2); i++) {

            if (num == 2) {
                isPrime = true;
                break;
            } else if (num % i == 0) {

                System.out.println("non prime: " + num);
                isPrime = false;
                break;

            }
        }

        if (isPrime) {
            System.out.println("prime : " + num);
        }

    }
}
