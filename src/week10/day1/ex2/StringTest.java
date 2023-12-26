package week10.day1.ex2;

public class StringTest {
    public static void main(String[] args) {

        // initializing using literal
//        String str1 = "Hello"; // 1st way to create object of String

        // initializing using object
//        String str2 = new String("Hi"); // 2nd way to create object of String

//        System.out.println(str2);

        // ------------------------------------

        // Strings are immutable (we can not change them)
        /*
        So each time when you try to change the value of String
        it will create a new string value in memory and will make so
        that str will now point to a new string value.
         */

//        String str = "Hello";
//        str = str + " my friend"; // trying to change
//
//        str = "Hi"; // trying to change
//
//        System.out.println(str); // Hello my friend

        // in java we have String pool. This is pool of String values.
        String str1 = "Hello";
        String str2 = "Hello";

        if(str1 == str2){ // ==  it check whether str1 and str2 are pointing to the same place in memory
            System.out.println("str1 and str2 are pointing to the same memory space");
        }

        // initializing using new
        String str3 = new String("Hello");

        if(str2 == str3){
            System.out.println("str2 and str3 are pointing to the same memory space");
        }
        else{
            System.out.println("str2 and str3 are using different memory space");
        }

        if(str2.equals(str3)) { // equals: checks if they have equal values
            System.out.println("str2 and str3 are equal");
        }

        // hello HEllo  equals -> false, equalsIgnoreCase -> true

    }
}
