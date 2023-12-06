package week7.day3.ex2;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){}

    public Date(int day, int month, int year){ //day=40, month=10, year=-200
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day){
        if(day >= 1 && day <= 31)
            this.day = day;
        else {
            System.out.println("not valid day value");
            this.day = 1;
        }
    }

    public int getDay(){
        return day;
    }

    public void setMonth(int month){
        if(month >= 1 && month <= 12)
            this.month = month;
        else {
            System.out.println("not valid month value");
            this.month = 1;
        }
    }

    public int getMonth(){
        return month;
    }

    public void setYear(int year){
        if(year >= 1)
            this.year = year;
        else {
            System.out.println("not valid year value");
            this.year = 2023;
        }
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }
}
