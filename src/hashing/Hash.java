package hashing;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(8);
        set.add(1);
        set.add(2);

        set.add(2);
        //Search 
        System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.contains(3));
         

    }
    
}
