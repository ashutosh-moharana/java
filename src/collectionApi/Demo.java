package collectionApi;


import java.util.*;


public class Demo {
    public static void main(String[] args) {
       List<String> list = List.of("Ashutosh","Moharana","Hello");

       list.stream()
               .filter(s-> s.startsWith("H"))
               .limit(1)
               .forEach(System.out::println);
    }
}
