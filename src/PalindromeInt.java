public class PalindromeInt {

    public static void main(String[] args) {
        int palindromeNumber = 0;
        int num =- 676;

        int originalNum = num;int flag = 1;
        if(num<0) {
        flag=0;
        }
            while (num > 0) {

                palindromeNumber = (palindromeNumber * 10) + (num % 10);
                System.out.println("palindrom ...in ... : " + palindromeNumber);
                num = num / 10;
            }


        if (originalNum == palindromeNumber)
            System.out.println("palindrom number : " + originalNum);
        else if( flag==0)
            System.out.println("not a palindrom number " + originalNum);



    }
}