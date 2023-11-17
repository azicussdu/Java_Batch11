package week4.day5;

import java.util.Scanner;

public class Methods_2 {

    /*
    If you create two methods with the same name, then their
    parameters should be different:
        1) or different amount of parameters
        2) or different type of parameters

     This theory(when you can create methods with the same name)
     we call: Method overloading
     */

    public static int getMax(int a, int b, int c){

    }

    public static int getMax(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }

    public static double getMax(double a, double b){
        if(a > b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("enter two double values: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        double max = getMax(num1, num2);
        System.out.println("max = " + max);

    }
}
