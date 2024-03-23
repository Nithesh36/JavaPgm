public class StartRightAngle {
    public static void main(String[] args) {
        System.out.println(" *  ");int j;
        int count=1;
        for(int i=0;i<=5;i++){
            System.out.println("row: "+i);
            for(j=i;j<=i*2;j++){

                System.out.print(count+ "  ");
                count++;
            }

            System.out.println(" ");
        }
    }
}

//3
// 3 4 5 6
// 4 5 6 7