package week7.day2.ex4;

/*
Enum is special "class".
Internally enum is implemented by using a class.
So enums also can have fields and constructors.

Every enum constant value - represents an object of your enum
 */

public enum Month {
    JANUARY(1, 31),
    FEBRUARY(2, 29),
    MARCH(3, 31),
    APRIL(4, 30),
    MAY(5, 31),
    JUNE(6, 30),
    JULY(7, 31),
    AUGUST(8, 31),
    SEPTEMBER(9, 30),
    OCTOBER(10, 31),
    NOVEMBER(11, 30),
    DECEMBER(12, 31);

    int daysAmount; // 31, 30, 29,
    int monthNumber; // 1,2,3 - 12
    Month(int monthNumber, int daysAmount){
        this.monthNumber = monthNumber;
        this.daysAmount = daysAmount;
    }

    public String toString(){
        return "days amount: " + daysAmount + ", month number: " + monthNumber;
    }
}
