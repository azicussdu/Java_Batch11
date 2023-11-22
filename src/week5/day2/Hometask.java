package week5.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hometask {
    public static void main(String[] args) {

        /*
            this code removes only 1 min and only 1 max element.
            But change it, so it removes all min all max elements
            So the final values should be = [4, 5, 5, 6]

            tip: to get the element from some index use list.get(index) method.
            for example: list.get(0) - gets the first value from arraylist

            another tip:
            you have to check - while the arraylist still contains max element
            then remove it, and search again does it still have max element and so on.
            And do the same with min element.
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 8, 5, 2, 2, 2, 8, 5, 6));

        Collections.sort(list);

        int min = list.getFirst();  // min = 2
        int max = list.getLast();   // max = 8

        while(list.contains(min)){
            if(list.get(0) == min)
                list.remove(0);
        }

        // I will reverse it, so max elements are in the beginning of arraylist now
        Collections.reverse(list);

        while(list.contains(max)){
            if(list.get(0) == max)
                list.remove(0);
        }

        System.out.println("the list is: " + list);

    }
}
