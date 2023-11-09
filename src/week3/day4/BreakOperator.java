package week3.day4;

public class BreakOperator {
    public static void main(String[] args) {

        //for loop stops when i = 21
        // but we can stop it earlier if we use break operator

//        for(int i=1; i<=20; i++){
//            System.out.println(i);
//            if(i == 10)
//                break;
//        }

        //the same code using while instead of for loop

//        int i=1;
//        while(i<=20){
//            System.out.println(i);
//            if(i == 10)
//                break;
//            i++;
//        }

        /*
        Calculate the total sum of all numbers from 1 till 1000.
        1+2+3+4+5....+1000

        if the total sum becomes more than 10 000,
        just stop the loop and show the total sum
         */

        int total = 0;

        for(int i=1; i<=1000; i++){
            total = total + i;
            if(total >= 10000)
                break;
        }

        System.out.println("total = " + total);
    }
}
