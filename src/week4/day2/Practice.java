package week4.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /*
        you will have an array of number with given values
        the program have to show the min and max number
         */

//        int[] numbers = {30, 40, 10, 20, 5, 60, 20, 30};
//
//        Arrays.sort(numbers);
//        System.out.println("min is = " + numbers[0]);
//        System.out.println("max is = " + numbers[numbers.length-1]);


        /*
        User inputs a long sentence.
        show each word of the sentence in sorted way (in descending order)

        enter a sentence: i am coding in java language
        language java in i coding am
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("enter a sentence: ");
        String sent = scan.nextLine();

        String[] words = sent.split(" ");
        Arrays.sort(words); // abdul is my name

        for(int i=words.length-1; i>=0; i--){
            System.out.print(words[i] + " ");
        }

    }
}
