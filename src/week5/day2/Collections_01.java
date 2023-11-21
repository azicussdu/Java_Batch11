package week5.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_01 {
    public static void main(String[] args) {

        // here we are creating empty static array
//        int[] numbers = new int[10];

        // here we are creating array with values
//        int[] numbers = {2, 3, 6, 4, 8, 9};

        // creating arraylist with no values (empty)
//        ArrayList<Double> list = new ArrayList<>();

//        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 6, 5, 7, 9)); // varargs
//        System.out.println("list1 values: " + list1);

//        int[] numbers = new int[10];
//        Arrays.fill(numbers, 5);

        /*
        We can use methods of Arrays class to work with static array.
        Also we can use methods of Collections class to work with ArrayList
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two", "four", "six"));

        System.out.println("list values: " + list);

        Collections.sort(list);
        System.out.println("after sort(): " + list);

        Collections.reverse(list);
        System.out.println("after reverse(): " + list);

        Collections.replaceAll(list, "one", "ten");
        System.out.println("after replaceAll(): " + list);

        Collections.addAll(list, "twenty", "thirty", "forty");
        System.out.println("after addAll(): " + list);

        String maxString = Collections.max(list);
        String minString = Collections.min(list);

        System.out.println("max String value: " + maxString);
        System.out.println("min String value: " + minString);

        // replace all values with "nine"
//        Collections.fill(list, "nine");
//        System.out.println("after fill(): " + list);
    }
}
