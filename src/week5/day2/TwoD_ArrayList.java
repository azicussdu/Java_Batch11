package week5.day2;

import java.util.Arrays;

public class TwoD_ArrayList {
    public static void main(String[] args) {

//        int[] arr1 = {1, 10, 11, 100};
//        int[] arr2 = {2, 20, 22, 200};

        int[][] twoDimArr = {
                {1, 10, 11, 100},
                {2, 20, 22, 200},
                {3, 30, 33, 300}
        };

        // it will print: {1, 10, 11, 100}
        // so it prints the whole row with index: 0
        System.out.println(Arrays.toString(twoDimArr[0]));

    }
}
