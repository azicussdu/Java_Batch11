package week4.day5;

public class Practice {

    public static int countOdds(int... nums){
        /*
        this method should count how many odd numbers we have
        inside 'nums' parameters and return the amount
         */
        return 0; //remove this return 0 (without it I can't save the code in github)
    }

    public static boolean isEven(int a){
        /*
        checks for value of 'a' parameter
        if 'a' is an even number then method should return true
        otherwise it should return false
         */
        return false; //remove this return false (without it I can't save the code in github)
    }

    public static int getRandom(int till){
        /*
        This method should generate a random number
        between 1 and till values.
        For example if till is equal to 100, so method
        should return random number in range 1 and 100.
        (you can use Math.random() here)
         */
        return 0; //remove this return 0 (without it I can't save the code in github)
    }

    public static void main(String[] args) {
        // amountOfOdds should be equal to 3 here (after method call)
        int amountOfOdds = countOdds(3, 4, 5, 5, 6);

        // isItEven should be false here (after method call)
        boolean isItEven = isEven(4);

        // randomNumber should be any random number between 1 and 20 (after method call)
        int randomNumber = getRandom(20);
    }
}
