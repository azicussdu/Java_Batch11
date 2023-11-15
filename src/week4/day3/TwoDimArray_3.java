package week4.day3;

public class TwoDimArray_3 {
    public static void main(String[] args) {

//        int[] numbers = new int[10];
//        int[] numbers = {10, 20, 30, 40};

//        int[][] numbers = new int[3][5]; // empty 2D array

        int[][] numbers = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120}
        };

        for(int i=0; i<numbers.length; i++){

            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }

    }
}
