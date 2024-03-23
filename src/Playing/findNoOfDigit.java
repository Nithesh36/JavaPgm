package Playing;

public class findNoOfDigit {
    public static void main(String[] args) {
        int num=98090;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
