package week5.day5;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Map_Dictionary {
    public static void main(String[] args) {

        /*
        all words in a dictionary should be sorted
        1-add word with translation
        2-change the translation for a word
        3-show all words from dictionary app
        4-see a translation for a given word
        5-remove a pair of  word-translation
        6-exit from dictionary app
         */

        TreeMap<String, String> tm = new TreeMap<>();
        Scanner scan = new Scanner(System.in);
        String word, translation;

        while(true){
            System.out.println("--- 1.add 2.change 3.show 4.search 5.remove 6.exit ---");
            System.out.print("choose a menu: ");
            int choice = scan.nextInt();

            switch (choice){
                case 1: case 2:
                    System.out.print("enter a word: ");
                    word = scan.next();
                    System.out.println("enter a translation: ");
                    translation = scan.next();
                    tm.put(word, translation);
                    break;
                case 3:
                    for(Map.Entry<String, String> entry : tm.entrySet()){
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;
                case 4:
                    System.out.print("enter a word in english: ");
                    word = scan.next();
                    translation = tm.get(word);
                    System.out.println("the translation is: " + translation);
                    break;
                case 5:
                    System.out.print("enter a word in english to remove: ");
                    word = scan.next();
                    tm.remove(word);
                    System.out.println("it was remove");
                    break;
                case 6:
                    System.out.println("bye bye");
                    break;
            }

            if(choice == 6){
                break;
            }
        }

    }
}
