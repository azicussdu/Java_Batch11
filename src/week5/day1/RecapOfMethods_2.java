package week5.day1;

public class RecapOfMethods_2 {

    public static int getMax(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        // 5 2 7 4

        /*
        if you want to use the results of a method
        then you should return a value
         */
        int max1 = getMax(5, 2);
        int max2 = getMax(7, 4);

        int veryMax = getMax(max1, max2);
        System.out.println("max = " + veryMax);

//        showMax(2, 5);
//        showMax(7, 4);
    }
}
