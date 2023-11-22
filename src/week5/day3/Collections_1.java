package week5.day3;

import java.util.*;

public class Collections_1 {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
//
//        // this is foreach loop
//        for(Integer num : list){
//            System.out.print(num + " ");
//        }
//
//        System.out.println();
//
//        for(int i=0; i<list.size(); i++){
//            System.out.print(list.get(i) + " ");  // numbers[i] - with static array
//        }

        /*
        ArrayList is one example of Collections classes.
        In java we have Collections.

        Collections - are data structures that we use
        to store and  manipulate the data.

        HashSet - is also one example of data structure, that
        we use to store UNIQUE values.
        Also HashSet stores values in some specific order,
        It stores them in an order which is better for HashSet,
        so after the values from HashSet are found quickly.
         */

//        HashSet<String> hs = new HashSet<>();
//        hs.add("Hamza");
//        hs.add("Polina");
//        hs.add("Hamza");
//        hs.add("Sahin");
//        hs.add("Polina");
//
//        System.out.println("hashSet: " + hs);
//        System.out.println("size of hs: " + hs.size());
//
//        hs.remove("Polina");
//
//        System.out.println("hashSet: " + hs);
//
//        if(hs.contains("Hamza"))
//            System.out.println("Yes, it contains name: Hamza");
//        else
//            System.out.println("It does not contain name: Hamza");
//
//        hs.clear();
//        System.out.println("hashSet: " + hs);
//
//        for(String name : hs){
//            System.out.print(name + " ");
//        }

        /*
        LinkedHashSet - is also a data structures, that stores unique elements.
        The difference between HashSet and LinkedHashSet is,
        that LinkedHashSet saves the order of elements in which they were inserted.
         */

//        hashSet: [Sahin, Polina, Hamza]
//        linkedHashSet: [Hamza, Polina, Sahin]
//        LinkedHashSet<String> lhs = new LinkedHashSet<>();
//        lhs.add("Hamza");
//        lhs.add("Polina");
//        lhs.add("Hamza");
//        lhs.add("Sahin");
//        lhs.add("Polina");
//
//        System.out.println("linkedHashSet: " + lhs);

        /*
        TreeSet - is also a data structure, that also stores unique elements,
        but it stores them sorted.
         */

//        TreeSet<String> ts = new TreeSet<>();
//        ts.add("Sahin");
//        ts.add("Hamza");
//        ts.add("Polina");
//        ts.add("Azamat");
//        ts.add("Hamza");
//        ts.add("Polina");
//
//        System.out.println("treeSet: " + ts);

//        TreeSet<Integer> ts2 = new TreeSet<>();
//        ts2.add(8);
//        ts2.add(3);
//        ts2.add(4);
//        ts2.add(4);
//        ts2.add(1);
//
//        System.out.println("treeSet: " + ts2);



    }
}
