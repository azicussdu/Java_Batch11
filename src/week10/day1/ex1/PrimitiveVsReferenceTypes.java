package week10.day1.ex1;

import java.util.Arrays;

public class PrimitiveVsReferenceTypes {
    public static void main(String[] args) {

        /*
        primitive types: int, long, double, char, boolean, float, short...
        reference types: classes-object, static arrays, ArrayList, String, Integer
         */

//        --------------- primitive type -----------------

//        int num1 = 5;
//        int num2 = 7;
//
//        num1 = num2;
//
//        num1 = 55;
//        num2 = 77;
//
//        System.out.println("num1 = " + num1); // 55
//        System.out.println("num2 = " + num2); // 77

//        --------------- reference type -----------------

//        int[] arr1 = {1, 2, 3, 4};
//        int[] arr2 = {5, 6};
//
//        arr1 = arr2;
//
//        System.out.println("arr1 = " + Arrays.toString(arr1)); // 5,6
//        System.out.println("arr2 = " + Arrays.toString(arr2)); // 5,6
//
//        arr1[0] = 100;
//        System.out.println("arr1 = " + Arrays.toString(arr1)); // 100, 6
//        System.out.println("arr2 = " + Arrays.toString(arr2)); // 100, 6
//
//        arr2[0] = 200;
//        System.out.println("arr1 = " + Arrays.toString(arr1)); // 200, 6
//        System.out.println("arr2 = " + Arrays.toString(arr2)); // 200, 6

//        Student st1 = new Student("Hamza");
//        Student st2 = new Student("Sahin");
//
//        st1 = st2;
//
//        System.out.println("st1.name: " + st1.name);
//        System.out.println("st2.name: " + st2.name);
//
//        st1.name = "Aliye";
//
//        System.out.println("st1.name: " + st1.name);
//        System.out.println("st2.name: " + st2.name);

        // -------------------------------

        int a = 5; // a = 20
        int b = 10; // b = 10

        a = b;
        a = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);





    }
}
