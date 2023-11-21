package week5.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Hometask {
    public static void main(String[] args) {

        /*
        User will enter several names until string "exit"

        Program has to ask to enter two names:
            first name is to search for
            second name is to replace with

        If program finds inside names arraylist the first name
        then program will replace it with the second name.

        If program can not find first name inside arraylist, then
        it just adds second name in the beginning of array
         */

        /*
        Hanna Sahin Polina Hamza exit

        first name: Sahin
        second name: Aliye

        [Hanna Aliye Polina Hamza] // so it replace the Sahin with Aliye
         */

        /*
        Hanna Sahin Polina Hamza exit

        first name: Tetiana
        second name: Aliye

        [Aliye Hanna Sahin Polina Hamza] // so just Aliye was added in the beginning
         */

        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("enter names one by one, to finish - enter \"exit\": ");

        while(true){
            String name = scan.next();
            if(name.equals("exit"))
                break;
            else{
                names.add(name);
            }
        }

        System.out.print("enter name to replace: ");
        String firstName = scan.next();

        System.out.print("enter name to put instead: ");
        String secondName = scan.next();

        if(names.contains(firstName)){
            // find index of firstName inside arraylist
            int indexOfFirst = names.indexOf(firstName);
            // replace it with secondName, using its index
            names.set(indexOfFirst, secondName);
        }
        else{
            names.add(0, secondName);
        }

        System.out.print("all values of names: " + names);
    }
}









