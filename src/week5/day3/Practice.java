package week5.day3;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

//        HashSet<Integer> hs = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(40, 50));

        // from hs remove all elements that you can find in list
//        hs.removeAll(list);
        // before hs = [10, 20, 30, 40, 50]
        // after hs = [10, 20, 30]

        // -----------------------------------------------------------------

//        HashSet<Integer> hs = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(40, 50));
//
//        hs.retainAll(list);
        // before: hs = 10, 20, 30, 40, 50
        // after:  hs = 40, 50

        // -----------------------------------------------------------------

//        ArrayList<String> engGrp = new ArrayList<>(Arrays.asList("Hamza", "Aliye", "Oguzhan", "Khalid"));
//        ArrayList<String> proGrp = new ArrayList<>(Arrays.asList("Khalid", "Aliye", "Polina", "Hanna"));

        /*
        Hometasks: (addAll(), removeAll(), retainAll())

        1) show me the students who study only programming.
        output: Polina, Hanna

        2) show me the students who study english and programming together.
        output: Aliye, Khalid

        3) show me the students who study only 1 subject.
        output: Hamza, Oguzhan, Polina, Hanna

         */

        /*
        show students who study only english
        output: Hamza, Oguzhan
         */

//        HashSet<String> hs = new HashSet<>();
//        hs.addAll(engGrp);      // "Hamza", "Aliye", "Oguzhan", "Khalid"
//        hs.removeAll(proGrp);   // "Hamza", "Oguzhan"
//
//        System.out.println("students who study only english: " + hs);

        /*
        Show all student names (without duplicating them).
        Show in alphabetic order.

        Should be an output like this: Aliye, Hamza, Hanna, Khalid, Oguzhan, Polina
         */

//        TreeSet<String> ts = new TreeSet<>();
//        ts.addAll(engGrp);
//        ts.addAll(proGrp);

//        System.out.println("ts values: " + ts);

    }
}
