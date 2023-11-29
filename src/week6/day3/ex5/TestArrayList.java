package week6.day3.ex5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<String> nameList =
                new ArrayList<>(Arrays.asList("Hanna", "Aliye", "Khalid", "Hamza"));

        for(String n : nameList){
            System.out.println("name is: " + n);
        }

    }
}
