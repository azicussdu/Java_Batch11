package week5.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) {

        /*
        Create an arraylist with some values inside.
        Values should be in a random order. (4, 7, 2, 3, 6, 5)

        remove the min and max elements
        before: 4, 7, 2, 3, 6, 5
        after:  4, 3, 6, 5
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 2, 8, 5, 6));

        Collections.sort(list);

        list.remove(0); // will remove the min value (the very first value)
        list.remove(list.size() - 1); // will remove the max value (the last value)

        System.out.println("the list is: " + list);

    }
}
