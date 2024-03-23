package javaRevise_coding;

public class PyradMidChars {
    //print a pyramid -same charter  value should increase only after a row
    public static void main(String[] args) {
        char alphaChar='a';
        for (int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+alphaChar +" ");
            }
            alphaChar++;
            System.out.println(" ");

        }
    }
}
