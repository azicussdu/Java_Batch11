package week4.day3;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /*
        create an array[3][4] and fill it with random numbers 1-100
        print all numbers of an array

        then let the user enter a number from keyboard (num = 55)

        found
        not found
         */

        Scanner scan = new Scanner(System.in);

        int[][] numbers = new int[3][4];

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                numbers[i][j] = (int)(Math.random() * 100 + 1);
            }
        }

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("enter a number: ");
        int num = scan.nextInt();

        boolean isFound = false;

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if(numbers[i][j] == num){
                    isFound = true;
                }
            }
        }

        if(isFound)
            System.out.println("found");
        else
            System.out.println("not found");



        /*
        create an array[3][4] and fill it with random numbers 1-100
        print all numbers of an array
        count the odd and even numbers and print it

        amount of odds are = 5
        amount of evens are = 7
         */

//        int[][] numbers = new int[3][4];
//
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers[i].length; j++){
//                numbers[i][j] = (int)(Math.random() * 100 + 1); // 1-100
//            }
//        }
//
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers[i].length; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int countOdds = 0;
//        int countEvens = 0;
//
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers[i].length; j++){
//                if(numbers[i][j] % 2 == 0)
//                    countEvens++;
//                else
//                    countOdds++;
//            }
//        }
//
//        System.out.println("the amount odds = " + countOdds);
//        System.out.println("the amount evens = " + countEvens);

        /*
        create an array[2][3] fill it with random 1-10
        print all numbers
        change all even numbers to 0, and all odd numbers -1
        print all numbers

        3 6 9
        4 1 2

        -1 0 -1
        0 -1 0
         */

//        int[][] numbers = new int[2][3];
//
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers[i].length; j++){
//                numbers[i][j] = (int)(Math.random() * 10 + 1);
//            }
//        }
//
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers[i].length; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers[i].length; j++){
//                if(numbers[i][j] % 2 == 1)
//                    numbers[i][j] = -1;
//                else
//                    numbers[i][j] = 0;
//            }
//        }
//
//        System.out.println();
//
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers[i].length; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}
