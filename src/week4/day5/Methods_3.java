package week4.day5;

public class Methods_3 {

    public static int getMax(int a, int b, int c){
        int max = a;

        if(b > max)
            max = b;

        if(c > max)
            max = c;

        return max;
    }

    public static int getMin(int a, int b, int c){
        int min = a;

        if(b < min)
            min = b;

        if(c < min)
            min = c;

        return min;
    }

    public static void main(String[] args) {
//        int max = getMax(8, 5, 7);
//        System.out.println("max = " + max);

        double avg = getAverage(4, 5, 5); // (4+4+5)/3 = 4.33333
        System.out.println("average = " + avg);
    }

    public static double getAverage(int a, int b, int c){
        double result = (double)(a+b+c) / 3;
        return result;
    }

}
