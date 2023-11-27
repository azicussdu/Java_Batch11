package week6.day1.ex2;

import java.util.Scanner;

public class TestSong {
    public static void main(String[] args) {

        Song s1 = new Song();
        s1.title = "Bohemian Rhapsody";
        s1.genre = "Rock";
        s1.performer = "Queen";
        s1.releaseYear = 1975;

        Song s2 = new Song();
        s2.title = "Happy new year";
        s2.genre = "Pop";
        s2.performer = "Abba";
        s2.releaseYear = 1999;

        System.out.println("song s1 title is: " + s1.title);
        System.out.println("song s2 title is: " + s2.title);
    }
}
