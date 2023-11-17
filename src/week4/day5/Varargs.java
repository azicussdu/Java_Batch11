package week4.day5;

public class Varargs {

    // variadic functions (varargs)

    public static int sum(int... nums){
        int total = 0;

        for(int i=0; i<nums.length; i++){
            total = total + nums[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int result = sum(4, 5, 1, 2, 3, 4, 5);
        System.out.println("result = " + result);
    }
}
