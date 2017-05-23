package com.codeclan.example.top10moviehomework;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class RankingTest {


    @Test
    public void canAddMovie() {
    Ranking topTenList = new Ranking();
        topTenList.add(new Movie("Superbad", "Comedy", 1));
        assertEquals(1, topTenList.getNumberOfMovies());
    }

    @Test
    public void canRemoveMovie() {
        Ranking topTenList = new Ranking();

        Movie movie1 = new Movie("Superbad", "Comedy", 1);
        Movie movie2 = new Movie("Step Brothers", "Comedy", 2);
        Movie movie3 = new Movie("Funny People", "Comedy", 3);
        topTenList.add(movie1);
        topTenList.add(movie2);
        topTenList.add(movie3);

        topTenList.remove(movie3);
        assertEquals(2, topTenList.getNumberOfMovies());
    }

    @Test
    public void canGetMovieByRank() {
        Ranking topTenList = new Ranking();

        Movie movie1 = new Movie("Superbad", "Comedy", 1);
        Movie movie2 = new Movie("Step Brothers", "Comedy", 2);
        Movie movie3 = new Movie("Funny People", "Comedy", 3);
        topTenList.add(movie1);
        topTenList.add(movie2);
        topTenList.add(movie3);

        String result = topTenList.getMovieByRank(1);
        assertEquals("Title: Superbad Genre: Comedy Rank: 1", result);
    }


}