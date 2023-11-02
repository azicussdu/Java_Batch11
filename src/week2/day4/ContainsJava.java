package week2.day4;

import java.util.Scanner;

public class ContainsJava {
    public static void main(String[] args) {

        /*
        User inputs a sentence.
        The system have to find if there is a word "Java" inside sentence.

        If you find it - print "Contains Java".
        If not, print - "Does not contain Java".
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sent = scan.nextLine(); // sent = "I am studying Java"

        // ---------- the 1st way: using boolean ---------

//        boolean hasJava = sent.contains("Java");
//
//        if(hasJava == true){
//            System.out.println("Contains Java");
//        }
//
//        if(hasJava == false){
//            System.out.println("Does not contain Java");
//        }

        // ---------- the second way ----------------------

        // sent = "I am studying C++"

        boolean hasJava = false;

        if(hasJava){ // is the same as: if(hasJava == true)
            System.out.println("Contains Java");
        }

        if(!hasJava){ // is the same as: if(hasJava == false)
            System.out.println("Does not contain Java");
        }

    }
}
