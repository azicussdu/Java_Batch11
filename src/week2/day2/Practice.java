package week2.day2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /*
        user inputs 2 word. The program have to show
        each word separately.

        Enter 2 words: Java language

        1st word is: Java
        2nd word is: language
         */

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter 2 words: ");
//
//        String sent = scan.nextLine();
//        int spacePos = sent.indexOf(" ");
//
//        String word1 = sent.substring(0, spacePos);
//        String word2 = sent.substring(spacePos+1);
//
//        System.out.println("the first word is: " + word1);
//        System.out.println("the second word is: " + word2);


        /*
        User enters a word. Program must change
        only the first letter to an uppercase letter.

        Enter a word: python
        After change: Python
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("enter a word: ");
//        String word = scan.next(); // word = "python"
//
//        String result = word.substring(0, 1).toUpperCase()
//                + word.substring(1);
//
//        System.out.println("result is: " + result);

        /*
        User inputs 3 words, the program should show only 1 and 3 word.

        Enter 3 words: my name Anna

        First word is: my
        Third word is: Anna
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("enter any 3 words: ");
//        String sent = scan.nextLine();
//
//        int spacePos1 = sent.indexOf(" "); // gives back position of first space
//        int spacePos2 = sent.lastIndexOf(" "); // gives back position of last space
//
//        String word1 = sent.substring(0, spacePos1); // 0 is included, but spacePos1 is NOT include
//        String word3 = sent.substring(spacePos2+1); // start right after last space and until the end of a string
//
//        System.out.println("The first word: " + word1);
//        System.out.println("The last word: " + word3);

    }
}
