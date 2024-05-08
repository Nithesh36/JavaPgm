package javaRevise_coding;

public class AbcPattern {


    public static void main(String[] args) {
        int j;
        char alpha = 'a';
        for (int i = 0; i < 5; i++) {

            for (j = 0; j <= i; j++) {
//                System.out.print("I: "+ i+"J: "+j);
                System.out.print(" " + (alpha++) +" ");

            }
            System.out.println(j);
            System.out.println(" ");

        }
    }
}
/*
I: 1 J: 0 a
I: 2 J: 0 b I: 2 J: 1 c
I: 3 J: 0 d I: 3 J: 1 e I: 3 J: 2 f
I: 4 J: 0 g I: 4 J: 1 h I: 4 J: 2 i I: 4 J: 3 j
 */