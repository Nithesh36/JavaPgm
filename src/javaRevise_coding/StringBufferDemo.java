package javaRevise_coding;

public class StringBufferDemo {
    public static void main(String[] args) {
        String[] Words = "helo demo".split("\\s+");
       for(int i=Words.length-1;i>=0;i--)
        System.out.print(" "+ Words[i] +" ");
    }
}
