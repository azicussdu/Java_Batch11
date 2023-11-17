package week4.day5;

import java.util.Scanner;

public class Methods_1 {

    public static void showMax(int a, int b){
        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static int getMax(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        /*
        User inputs four integers. You need to show maximum out of these four values.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("enter 4 integers: ");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int maxOfAB = getMax(a, b);
        int maxOfCD = getMax(c, d);

        int max = getMax(maxOfAB, maxOfCD);
        System.out.println("max = " + max);

//        ---------------------------------------------

//        int result = getMax(5, 8);
//        System.out.println("result = " + result);

//        showMax(10, 6);

//        int result = Math.max(10, 6);
//        System.out.println("result = " + result);

    }
}
