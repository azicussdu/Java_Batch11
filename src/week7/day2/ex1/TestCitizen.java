package week7.day2.ex1;

public class TestCitizen {
    public static void main(String[] args) {

        // final variables, final fields

        Citizen c1 = new Citizen();
//        c1.id = 1;
//
        Citizen c2 = new Citizen();
//        c2.id = 2;
//        c2.id = 1;

        System.out.println(c1.countryName);
        System.out.println(c2.countryName);

        /*
        when we use "final" with variables: after you initialize the variable
        - then you can not change the value of it
         */
//        final int num = 10; // final ~ constant
//        num = 20;

//        final int num;
//        num = 10;
//        num = 20;

    }
}
