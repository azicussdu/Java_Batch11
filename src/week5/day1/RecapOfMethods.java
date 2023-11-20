package week5.day1;

import java.util.Arrays;

public class RecapOfMethods {

    public static void printArray(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static int getMaxFromArray(int[] numbers){
        Arrays.sort(numbers);
        int max = numbers[numbers.length-1];
        return max;
    }

    public static void main(String[] args) {

        int[] numbers = {4, 2, 6, 8, 7, 5, 1};
        printArray(numbers);

        int maxElement = getMaxFromArray(numbers);
        System.out.println("the max elem = " + maxElement);
    }
}
