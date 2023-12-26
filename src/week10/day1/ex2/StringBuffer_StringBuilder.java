package week10.day1.ex2;

import java.sql.SQLOutput;

public class StringBuffer_StringBuilder {
    public static void main(String[] args) {

        /*
        StringBuffer and StringBuilder: classes that we use to perform
        some operations on Strings.

        If String is immutable, StringBuffer and StringBuilder are mutable.
        So Strings are quite slow than StringBuffer and StringBuilder.
         */

//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" my friend");
//        sb.reverse();
//
//        System.out.println(sb);

        // -----------------------------------------------------

//        String str = "hi";
//
//        long startTime = System.currentTimeMillis();
//
//        for(int i=1; i<100000; i++){
//            str = str + "a";
//        }
//
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("for String it takes " + (endTime - startTime) + " milliseconds");

        // -----------------------------------------

        StringBuffer sb = new StringBuffer("hi");

        long startTime = System.currentTimeMillis();

        for(int i=1; i<100000; i++){
            sb.append("a");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("for StringBuffer it takes " + (endTime - startTime) + " milliseconds");

        System.out.println(sb);

    }
}
