package week10.recap.maps;

import java.util.HashMap;

public class RepeatMaps {
    public static void main(String[] args) {

        /*
        HashMap - holds the data as pair of values (key - value pairs).
        Keys are not duplicated, but values can be duplicated.
         */

//        HashMap<Integer, String> myMap = new HashMap<>();
//        myMap.put(1, "Hamza");
//        myMap.put(2, "Aliye");
//        myMap.put(3, "Tetiana");
//        myMap.put(1, "Hanna");
//
//        System.out.println(myMap);
//
//        String myValue = myMap.get(2);
//        System.out.println("By key 2 I got value: " + myValue);
//
//        myMap.remove(1);
//        System.out.println(myMap);
//
//        if(myMap.containsKey(2)){
//            System.out.println("in key 2 there is a value: " + myMap.get(2));
//        }
//
//        if(myMap.containsValue("Tetiana")){
//            System.out.println("Yes, it has a value = Tetiana");
//        }

        // -------------------------------

        HashMap<Integer, HashMap<String, String>> myMap = new HashMap<>();

        // key             value
        //  1  --------->  ("Bir" -> "One")
    }
}
