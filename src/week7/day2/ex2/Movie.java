package week7.day2.ex2;

public class Movie {
    String title;
    Genre movieGenre;

    public Movie(String title, Genre movieGenre){
        this.title = title;
        this.movieGenre = movieGenre;
    }

    public String toString(){
        return "title: " + title + ", genre: " + movieGenre;
    }
}
