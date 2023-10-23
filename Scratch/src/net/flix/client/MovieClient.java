package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {
    public static void main(String[] args) {
        Movie m1 = new Movie("Airplane");
        m1.setReleaseYear(1988);
        m1.setRevenue(240_000_000.0);
        m1.setRating(Rating.R);
        m1.setGenre(Genre.ACTION);
        System.out.println(m1);

        Movie m2 = new Movie("J2J", Genre.COMEDY);
        System.out.println(m2);

        Movie m3 = new Movie("Ironman", 2008, 4000000.0, Rating.R, Genre.SPORTS_ROMANCE);
        System.out.println(m3);

    }
}