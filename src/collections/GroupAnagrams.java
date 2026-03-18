package collections;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>>  grps = new HashMap<>();

        for(String s:strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedArr = new String(charArr);

              if(!grps.containsKey(sortedArr)){
                  grps.put(sortedArr,new ArrayList<>());
              }
              grps.get(sortedArr).add(s);
        }
        System.out.println(grps);

    }
}
