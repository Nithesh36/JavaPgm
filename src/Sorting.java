public class Sorting {
String s="helo";

    public static void main(String[] args) {


        int[] ar ={1,11,8,9};

        for (int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]>ar[i]) {
                    int temp = ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    for(int ele:ar){
        System.out.println(ele);
    }
    }
}
