package sorting;

import java.util.Arrays;

public class AscendingSort {
    public static void main(String[] args) {
        int arr[]={99,2,6,3,888,922,4,5};
//low to high
        for (int i = 0; i <arr.length ; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
