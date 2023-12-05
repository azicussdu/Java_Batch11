package week7.day2.ex4;

public class TestMonthEnum {
    public static void main(String[] args) {

        Date d1 = new Date();
        d1.day = 21;
        d1.month = Month.FEBRUARY;
        d1.year = 2022;

        System.out.println(d1);

        // -----------------------------

//        Month month1 = Month.DECEMBER;
//
//        System.out.println(month1);

//        System.out.println("month number: " + month1.monthNumber);
//        System.out.println("days amount: " + month1.daysAmount);

    }
}
