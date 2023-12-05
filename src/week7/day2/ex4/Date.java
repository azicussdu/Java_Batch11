package week7.day2.ex4;

public class Date {
    int day;
    Month month;
    int year;

    public String toString(){
        return day + "-" + month.monthNumber + "-" + year;
    }
}
