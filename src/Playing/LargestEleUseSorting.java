package Playing;

import java.util.Arrays;

public class LargestEleUseSorting {
    public static void main(String[] args) {
        int[] ele ={4,3,2,99,77,-1,878};
        int temp=0;
        for (int i=0;i<ele.length;i++){
            for (int j=i+1;j<ele.length;j++)
                if(ele[j]>ele[i])
                {
                    temp=ele[i];
                    ele[i]=ele[j];
                    ele[j]=temp;
                }
        }
        System.out.println(Arrays.toString(ele));

        System.out.println(ele[1]);
    }
}
