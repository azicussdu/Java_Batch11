package week10.recap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRecap {
    public static void main(String[] args) {

        //static arrays have fixed size, for example = 100
//        int[] arr = new int[100];

        //dynamic arrays are more flexible, the size can grow or shrink
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println("list.size(): " + list.size());
//
//        list.add(43);
//        list.add(53);
//
//        System.out.println("list.size(): " + list.size());
//
//        list.remove(0);
//
//        System.out.println("list.size(): " + list.size());

        // --------------------------------------

        ArrayList<String> words = new ArrayList<>(Arrays.asList("C++", "Java", "Python", "C#", "Javascript"));
        System.out.println(words);

        words.add("Php"); // add at the end
        words.add(0, "Html");

        System.out.println(words);

        System.out.println("words.get(2): " + words.get(2));

        if(words.contains("C#"))
            System.out.println("It contains C# value");
        else
            System.out.println("It does not contain C#");

        words.set(0, "Css"); // changes html to css

        System.out.println(words);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Mary", "Jake"));

        words.addAll(names);

        words.addFirst("Ruby"); // the same as: words.add(0, "Html");

        System.out.println(words);

        int indexOfCss = words.indexOf("Css");
        System.out.println("indexOfCss = " + indexOfCss);
    }
}
