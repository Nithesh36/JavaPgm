package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//public final class Constructors {
//   private Constructors(int a){
//        System.out.println("helo");
//    }
//    Constructors(String js){
//        System.out.println("demo");
//    }
//    public static void main(String[] args) {
//        new  Constructors(5);
//        new Constructors("d");
//
//    }
//}
//class A{
//    void msg(){System.out.println("A: helo");}
//}
//class B extends  A{
//    void msg(){System.out.println("Welcome");}
//}
public class C {//suppose if it were
static int c;
//    public static void main1() {
//
//    }public static void main33() {
//        main2();
//        int f=c;
//    }
//    public  void main2(String[] args) {
//        //main1();
//
//    }
    public static void main(String args[]){
       // ArrayList
       //Now which
        // msg() method would be invoked?
        C demo=new C();
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(1,4);
        mp.put(4,8);
        for(Map.Entry<Integer,Integer>mp1: mp.entrySet()){
            System.out.println(mp1.getValue());
        }

    }
}