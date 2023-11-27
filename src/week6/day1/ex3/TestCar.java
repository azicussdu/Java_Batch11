package week6.day1.ex3;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Car c1 = new Car();

        System.out.print("enter a make: ");
        c1.make = scan.nextLine();
        System.out.print("enter a year of production: ");
        c1.year = scan.nextInt();
        System.out.print("enter true if it is diesel, false if gasoline");
        c1.diesel = scan.nextBoolean();
        System.out.print("enter engine volume: ");
        c1.engineVolume = scan.nextDouble();

        System.out.println("c1.make: " + c1.make);
        System.out.println("c1.year: " + c1.year);
        System.out.println("c1.diesel: " + c1.diesel);
        System.out.println("c1.engineVolume: " + c1.engineVolume);





    }
}
