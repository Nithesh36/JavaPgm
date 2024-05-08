package javaRevise_coding;

public class StringBufferDemo {
    public static void main(String[] args) {
        String[] Words = "helo demo".split("\\s+");
//       for(int i=Words.length-1;i>=0;i--)
//        System.out.print(" "+ Words[i] +" ");
        String a[]=new String[10];
        boolean mo = "demoHeko".startsWith( "He",4);
        StringBuffer insert = new StringBuffer("demoHeko").replace(0, 1,"F");
//        StringBuffer inser1t = new StringBuffer("demoHeko").
        System.out.println(insert);
    }
}
