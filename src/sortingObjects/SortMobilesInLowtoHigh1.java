package sortingObjects;


import java.util.ArrayList;
import java.util.Collections;

class   Mobiles1 implements  Comparable<Mobiles1>{
    String name;
    //"sony,Nokia"
    int price; //122,872
    int model;
    public Mobiles1(String name, int price,int model) {
        this.name = name;
        this.price = price;
        this.model = model;

    }


    @Override
    public int compareTo(Mobiles1 o) {
        //sorting from High to low
        if(this.price<o.price)
            return 1;
        else if(this.price>o.price)
            return -1;
        else
        return 0;
//      return 0;
    }
}
public class SortMobilesInLowtoHigh1 {

    public static void main(String[] args) {


        ArrayList<Mobiles1>mobileObj=new ArrayList<>();
        mobileObj.add(new Mobiles1("sony",47,98));
        mobileObj.add(new Mobiles1("nokia",1244,33));
        mobileObj.add(new Mobiles1("apple",1200,11));

        Collections.sort(mobileObj);
        for (int i = 0; i < mobileObj.size(); i++) {
            System.out.println(mobileObj.get(i).price);
        }

    }
}
