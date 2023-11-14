package week4.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /*
        enter the size: 5
        enter values: 40.4  54.3  26.4  76.2  87.3

        87.3  76.2  26.4  54.3  40.4
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("enter the array size: ");
//        int size = scan.nextInt();
//
//        double[] numbers = new double[size];
//        for(int i=0; i<size; i++){
//            numbers[i] = scan.nextDouble();
//        }
//
//        for(int i=size-1; i>=0; i--){
//            System.out.print(numbers[i] + " ");
//        }


        /*
        enter the size: 5
        after generating random: 40 -54 26 -76 87

        Positive
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("enter the array size: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = (int)(Math.random() * 201)-100;  // (-100  +100)
        }

        for(int i=0; i<size; i++){
            System.out.print(numbers[i] + " ");
        }

        int countPos = 0;
        int countNeg = 0;
        for(int i=0; i<size; i++){
            if(numbers[i] > 0)
                countPos++;
            if(numbers[i] < 0)
                countNeg++;
        }

        if(countPos > countNeg)
            System.out.println("Positive");
        else
            if(countNeg > countPos)
                System.out.println("Negative");
            else
                System.out.println("Equal");

    }
}
