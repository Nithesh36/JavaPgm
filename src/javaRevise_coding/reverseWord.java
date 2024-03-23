package javaRevise_coding;

public class reverseWord {
    public static void main(String[] args) {
        String myName="Nithesh kumar Eswaran";

        String reverseWordUtility[]=myName.split(" ");

            StringBuffer sb=new StringBuffer();
        for(int i=0;i<reverseWordUtility.length-1;i++){

            sb.append(reverseWordUtility[i]).append(" ");

          sb  .reverse();

        }
        System.out.println(sb);
    }
}
