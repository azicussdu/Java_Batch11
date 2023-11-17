package week4.day4;

import java.util.Arrays;

public class Methods_6 {

    public static void fillWithRandom(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100 + 1); // 1-10
        }
    }

    public static void printArray(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10]; // 0 0 0 0 0 0 0 0 0 0

        fillWithRandom(numbers);
        printArray(numbers);

        System.out.println();

        showMaxNumber2(numbers);

//        showMaxNumber(numbers); // show the maximum value inside array
//        showMinNumber(numbers); // show the minimum value inside array
    }

    public static void showMaxNumber2(int[] numbers){
        int max = numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println("max = " + max);
    }

    public static void showMaxNumber(int[] numbers){
        Arrays.sort(numbers);
        System.out.println("max is = " + numbers[numbers.length-1]);
    }

    public static void showMinNumber(int[] numbers){
        Arrays.sort(numbers);
        System.out.println("min is = " + numbers[0]);
    }
}
