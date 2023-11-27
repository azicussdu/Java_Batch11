package week6.day1.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCar2 {

    public static void showOnlyNewCars(ArrayList<Car> list){
        for(Car carObj : list){
            if(carObj.year >= 2020){
                System.out.println("make: " + carObj.make);
                System.out.println("year: " + carObj.year);
                System.out.println("diesel: " + carObj.diesel);
                System.out.println("engineVolume: " + carObj.engineVolume);
                System.out.println("-------------------------------------");
            }
        }
    }
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.make = "Toyota";
        c1.year = 2020;
        c1.diesel = true;
        c1.engineVolume = 2.5;

        Car c2 = new Car();
        c2.make = "BMW";
        c2.year = 2018;
        c2.diesel = false;
        c2.engineVolume = 3.5;

        Car c3 = new Car();
        c3.make = "Mercedes";
        c3.year = 2022;
        c3.diesel = true;
        c3.engineVolume = 2.6;

        Car c4 = new Car();
        c4.make = "Ferrari";
        c4.year = 2019;
        c4.diesel = true;
        c4.engineVolume = 5.0;

        Car c5 = new Car();
        c5.make = "Maserati";
        c5.year = 2021;
        c5.diesel = false;
        c5.engineVolume = 4.2;

        // Created ArrayList of Car objects
        ArrayList<Car> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        showOnlyNewCars(list);

//        for(Car carObj : list){
//            if(carObj.engineVolume >= 3.5 && carObj.engineVolume <= 4.5){
//                System.out.println("make: " + carObj.make);
//                System.out.println("year: " + carObj.year);
//                System.out.println("diesel: " + carObj.diesel);
//                System.out.println("engineVolume: " + carObj.engineVolume);
//                System.out.println("-------------------------------------");
//            }
//        }

//        for(Car carObj : list){
//            if(carObj.year >= 2020){
//                System.out.println("make: " + carObj.make);
//                System.out.println("year: " + carObj.year);
//                System.out.println("diesel: " + carObj.diesel);
//                System.out.println("engineVolume: " + carObj.engineVolume);
//                System.out.println("-------------------------------------");
//            }
//        }

//        for(Car carObj : list){
//            System.out.println("make: " + carObj.make);
//            System.out.println("year: " + carObj.year);
//            System.out.println("diesel: " + carObj.diesel);
//            System.out.println("engineVolume: " + carObj.engineVolume);
//            System.out.println("-------------------------------------");
//        }



//        for(int i=1; i<=3; i++){
//            Car carObj = new Car();
//
//            System.out.print("enter a make: ");
//            carObj.make = scan.nextLine();
//            System.out.print("enter a year of production: ");
//            carObj.year = scan.nextInt();
//            System.out.print("enter true if it is diesel, false if gasoline");
//            carObj.diesel = scan.nextBoolean();
//            System.out.print("enter engine volume: ");
//            carObj.engineVolume = scan.nextDouble();
//        }

    }
}
