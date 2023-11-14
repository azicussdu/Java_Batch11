package week4.day2;

public class ArrayExample2 {
    public static void main(String[] args) {

        String str = "Hello how are you";
        String[] words = str.split(" ");

        System.out.println("size of words array is: " + words.length);
        System.out.println("first word is: " + words[0]);
        System.out.println("last word is: " + words[words.length-1]);

    }
}
