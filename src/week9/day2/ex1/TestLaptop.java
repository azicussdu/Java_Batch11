package week9.day2.ex1;

public class TestLaptop {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Asus");
        laptop1.setMadeYear(2020);

        System.out.println(laptop1); // also will call toString() method

//        System.out.println("brand: " + laptop1.getBrand());
//        System.out.println("made year: " + laptop1.getMadeYear());

//        Laptop laptop1 = new Laptop("MacBook", 2022); // created 1 object
//
//        Laptop laptop2 = new Laptop(); // another object of Laptop
//        System.out.println(laptop2.madeYear);
//
//        laptop2.brand = "HP";
//        laptop2.madeYear = 2000;

    }
}
