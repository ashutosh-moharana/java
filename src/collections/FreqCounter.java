package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FreqCounter {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,4};
        Map<Integer,Integer> freq = new HashMap<>();

        for(int elem: nums){
            freq.put(elem,freq.getOrDefault(elem,0)+1);
        }
        System.out.println(freq);
        Collection<Integer> val = freq.values();
        System.out.println(val);
    }
}
