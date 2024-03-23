package javaRevise_coding;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String>mymap=new HashMap<>();
        mymap.put("name","Nithesh");
        mymap.put("age","23");
        System.out.println(mymap.put("name","get"));
        for(Map.Entry<String,String>KeysAndPair:mymap.entrySet()){
            KeysAndPair.getValue();
            KeysAndPair.getKey();
            System.out.println("values: "+KeysAndPair.getValue());
        }

      //  System.out.println(mymap.put("name","Nithesh"));
       // Collection<String> mapLs=mymap.values();
      //  System.out.println("maptoList : " +mapLs);
        mymap.remove("age","23");
        System.out.println(mymap.get("age"));
        mymap.put("age","wel");
        System.out.println(mymap.get("age"));


    }
}
