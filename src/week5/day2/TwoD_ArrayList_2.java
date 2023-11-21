package week5.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoD_ArrayList_2 {
    public static void main(String[] args) {

        // Let us create 3 one-dimensional ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 10, 11, 100));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 20, 22, 200));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(3, 30, 33, 300));


        ArrayList<  ArrayList<Integer>  > twoDimArr = new ArrayList<>();

        twoDimArr.add(list1);
        twoDimArr.add(list2);
        twoDimArr.add(list3);

        System.out.println("the row 0 is: " + twoDimArr.get(0));
        System.out.println("element from row 0 and column 2 is: " + twoDimArr.get(0).get(2));

        System.out.println("the amount of rows: " + twoDimArr.size());
        System.out.println("amount of columns inside row 0: " + twoDimArr.get(0).size());
    }
}
