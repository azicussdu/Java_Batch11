package week5.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Collections_2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(20, 40, 30, 20, 70, 40, 50));

        HashSet<Integer> hs = new HashSet<>(list); // third way, writing list inside paranthesis

        // first way of adding arrayList elements into hashSet (using foreach loop)
//        for(Integer num : list){
//            hs.add(num);
//        }

        // second way: using addAll()
//        hs.addAll(list); // take all elements from list and add them into hs

        System.out.println("hs: " + hs);

    }
}
