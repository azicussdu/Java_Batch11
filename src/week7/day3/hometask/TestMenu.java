package week7.day3.hometask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMenu {
    public static void main(String[] args) {

        Food f1 = new Food("Burger", 35);
        Food f2 = new Food("Maklube", 95);
        Food f3 = new Food("Beef with vegetable", 135);
        Food f4 = new Food("Seafood", 75);

        ArrayList<Food> fList = new ArrayList<>(Arrays.asList(f1, f2, f3, f4));

        Menu menu1 = new Menu("Kitchen of Jack", fList);
        System.out.println(menu1);

    }
}
