package week4.day3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArray_1 {
    public static void main(String[] args) {

        // syntax of creation of 2D array
//        int[][] numbers = new int[3][5];

        // I am writing a value to a cel with row index=1 and column index=2
//        numbers[1][2] = 10;

//        ---------------------------------------------

        // nestep loops

//        for(int i=0; i<=2; i++){
//            for(int j=0; j<=3; j++){
//                System.out.print(i + "-" + j + "  ");
//            }
//            System.out.println();
//        }

        // --------------------------------------------

        int[][] numbers = new int[3][4];

//        System.out.println(numbers.length); // size of rows
//        System.out.println(numbers[0].length); // size of columns

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                numbers[i][j] = (int)(Math.random() * 10 + 1);  //scan.nextInt();
            }
        }

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("now I will print row with index:0 => ");
        System.out.println(Arrays.toString(numbers[0]));

        System.out.print("now I will print row with index:1 => ");
        System.out.println(Arrays.toString(numbers[1]));

        System.out.print("now I will print row with index:2 => ");
        System.out.println(Arrays.toString(numbers[2]));

    }
}
