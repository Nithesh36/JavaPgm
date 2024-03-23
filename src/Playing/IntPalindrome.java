package Playing;

public class IntPalindrome {



    public static void main(String[] args) {
        int num=451;
        int originalNum=num;
        int reverse=0;
        while(num>0){
            reverse=(reverse *10)+num%10;
            num=num/10;
        }

        if(originalNum == reverse) {
            System.out.println("palindroe "+originalNum);
        }
        else
            System.out.println("not a palindroe : "+originalNum);
    }

}
