package week5.day5;

import java.util.HashMap;
import java.util.Map;

public class Map_2 {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Turkey", 85);
        hm.put("Germany", 87);
        hm.put("USA", 200);
        hm.put("Portugal", 64);

        System.out.println("entrySet of my map is: " + hm.entrySet());

        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            System.out.println("key = " + entry.getKey() + " | value = " + entry.getValue());
        }


//        System.out.println(hm);

//        to iterate over the values:
//        System.out.println("values of my map: " + hm.values());
//        for(Integer value : hm.values()){
//            System.out.println("value: " + value);
//        }

//        to iterate over the keys
//        System.out.println("keySet of my map: " + hm.keySet());
//        for(String key : hm.keySet()){ // foreach loop
//            System.out.println("key: " + key);
//        }

        // get() - returns you the value by the key
//        System.out.println("population of Germany = " + hm.get("Germany"));

        // containsKey() - returns true if there is a given key in map, otherwise it returns false
//        System.out.println("hashmap contains a key=Turkey: " + hm.containsKey("Turkey"));

        //containsValue() the same as containsKey() but it searches among values only
//        System.out.println("if there is a population=87: " + hm.containsValue(87));

//        hm.remove("Portugal");
//        System.out.println("after I remove the Portugal: " + hm);

    }
}
