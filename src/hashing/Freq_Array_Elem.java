package hashing;

import java.util.*;


public class Freq_Array_Elem {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        // Mapping string values to integer keys
        hm.put(10, "Geeks");
        hm.put(15, "for");
        hm.put(20, "Geeks");
        hm.put(25, "Welcomes");
        hm.put(30, "You");

        System.out.println(hm.keySet());
        System.out.println();


         for(Map.Entry<Integer, String> entry: hm.entrySet()){
             System.out.println("Key is: "+ entry.getKey()+" and the value is: "+entry.getValue());
         }
        System.out.println();

         for(Integer key: hm.keySet()){
             System.out.println("Key is : "+key+ " and Value is: "+hm.get(key));
         }
        System.out.println();
        for(String value: hm.values()){
            System.out.println( "Value is: "+value);
        }

        System.out.println();
        hm.forEach((key,value)-> System.out.println(key+"="+value));
    }
}
