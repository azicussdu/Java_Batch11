package week5.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_3 {
    public static void main(String[] args) {

        /*
        User will enter several names until string "exit"

        Program has to ask to enter a name to search for.
        User enters one name. After program has to find this name
        and show its position(index) or if this name is not in the arraylist
        so print "not found"
         */

        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("enter names, until word \"exit\": ");

        while(true){
            String name = scan.nextLine();
            if(name.equals("exit")){
                break;
            }
            else{
                names.add(name);
            }
        }

        System.out.print("enter the name that you are searching: ");
        String nameToSearch = scan.nextLine();

        int position = names.indexOf(nameToSearch);

        if(position == -1)
            System.out.println("Not found");
        else
            System.out.println("Found in index = " + position);

    }
}
