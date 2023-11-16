package week4.day4;

public class Methods_6 {

    public static void fillWithRandom(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            numbers[i] = (int)(Math.random() * 10 + 1); // 1-10
        }
    }

    public static void printArray(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10]; // 0 0 0 0 0 0 0 0 0 0

        fillWithRandom(numbers);
        printArray(numbers);

//        showMaxNumber(numbers); // show the maximum value inside array
//        showMinValue(numbers); // show the minimum value inside array
    }
}
