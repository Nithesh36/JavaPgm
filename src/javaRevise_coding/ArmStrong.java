package javaRevise_coding;

public class ArmStrong {
    public static void main(String[] args) {
        int num= 154;
        int originalNum=num;
        int armStrongNum=0,temp=1;int rem;
        int  count=String.valueOf(num).length();
        System.out.println(count);
        while(num>0){
            temp=1;
    rem=num%10;
            System.out.println("reminder: "+rem);
    for(int i=0;i<count;i++){
        temp=temp*rem;
    }
            System.out.println(temp);
    armStrongNum=armStrongNum+temp;
    num=num/10;
        }

        if(armStrongNum==originalNum)
            System.out.println("armstrong number : "+armStrongNum);
        else
            System.out.println("not a armStrongNum");
    }

}
