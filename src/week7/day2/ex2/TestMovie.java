package week7.day2.ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMovie {
    public static void main(String[] args) {

        Movie m1 = new Movie("The Titanic", Genre.DRAMA);
        Movie m2 = new Movie("Home alone", Genre.COMEDY);
        Movie m3 = new Movie("Brave heart", Genre.DRAMA);
        Movie m4 = new Movie("Rush hour", Genre.COMEDY);
        Movie m5 = new Movie("Rapunsel", Genre.THRILLER);

        ArrayList<Movie> moviesList = new ArrayList<>(Arrays.asList(m1, m2, m3, m4, m5));

//        for (Movie movie : moviesList) {
//            if(movie.movieGenre == Genre.COMEDY){
//                System.out.println(movie);
//            }
//        }

        showMoviesByGenre(moviesList, Genre.COMEDY);
    }

    public static void showMoviesByGenre(ArrayList<Movie> moviesList, Genre filterGenre){
        for (Movie movie : moviesList) {
            if(movie.movieGenre == filterGenre){
                System.out.println(movie);
            }
        }
    }
}
