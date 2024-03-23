package javaRevise_coding;

public class staticPract {
    static  int a;
    static {
        a=88;
    }
  static   void myStaticMethod(){
a=11;
  }
    public static void main(String[] args) {
        myStaticMethod();
        System.out.println(a);
    }
}
