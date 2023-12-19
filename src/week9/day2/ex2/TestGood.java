package week9.day2.ex2;

import java.util.ArrayList;

public class TestGood {
    public static void main(String[] args) {

        ElectronicGood eg1 = new ElectronicGood("Asus Tuf Gaming", 1500, DeviceType.LAPTOP);
        eg1.showDescription();

        ClothingGood cg1 = new ClothingGood("Jeans", 120, Color.BLUE);
        cg1.showDescription();

        ArrayList<Good> goodsList = new ArrayList<>();
        goodsList.add(eg1);
        goodsList.add(cg1);

        /*
        Polymorphism - many forms. One object can have many forms.
        ElectronicGood - is an electronic good and also just a good
         */

        /*
        difference between abstract classes VS interfaces.
        - abstract classes have normal fields and constructors
        - you can extend from only 1 abstract class (or class),
          but you can implement more than 1 interface
        - all methods in interface(except default methods) are by default
          abstract and public
         */


    }
}
