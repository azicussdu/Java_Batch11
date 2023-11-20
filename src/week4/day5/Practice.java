package week4.day5;

import java.util.Arrays;

public class Practice {

    public static int countOdds(int... nums){
        int countOdds = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 1){
                countOdds++;
            }
        }
        return countOdds;
    }

    public static boolean isEven(int a){
        return (a % 2 == 0);

//        if(a % 2 == 0)
//            return true;
//        else
//            return false;
    }

    public static int getRandom(int till){
        int random = (int)(Math.random() * till + 1);   // 1 - till
        return random;
    }

    public static void main(String[] args) {
        // amountOfOdds should be equal to 4 here (after method call)
//        int amountOfOdds = countOdds(3, 4, 5, 5, 6, 5, 4);
//        System.out.println("the amount of odds are: " + amountOfOdds);

        // isItEven should be false here (after method call)
//        boolean isItEven = isEven(4);
//        System.out.println("it is an even number result = " + isItEven);

        // randomNumber should be any random number between 1 and 20 (after method call)
        int randomNumber = getRandom(100); // 1-100
        System.out.println("the random number is " + randomNumber);

    }
}
