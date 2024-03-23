package Playing;

public class LargestSecondElem {
    public static void main(String[] args) {
        int[] ele ={4,3,2,99,99,44,44,-1,878};
        int max=Integer.MIN_VALUE;
        int secondLargest = 0;
        for(int elem:ele){
            if(elem>max)
            {
                secondLargest=max;
                max=elem;
            }
            else if ( elem != max) {
                System.out.println(elem +" debug");
                secondLargest = elem;
            }
        }
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element.");
        }

    }
}
