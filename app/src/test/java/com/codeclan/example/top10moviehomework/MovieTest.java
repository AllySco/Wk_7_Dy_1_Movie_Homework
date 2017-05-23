package com.codeclan.example.top10moviehomework;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class MovieTest {

    @Test
    public void canGetTitle() {
        Movie film = new Movie("Die Hard", "Action", 1);
        assertEquals("Die Hard", film.getTitle());
    }

    @Test
    public void canGetGenre() {
        Movie film = new Movie("Die Hard", "Action", 1);
        assertEquals("Action", film.getGenre());
    }


    @Test
    public void canGetRanking() {
        Movie film = new Movie("Die Hard", "Action", 1);
        assertEquals(1, film.getRanking());
    }

    @Test
    public void canSetTitle() {
        Movie film = new Movie("Die Hard", "Action", 1);
        film.setTitle("Step Brothers");
        assertEquals("Step Brothers", film.getTitle());
    }

    @Test
    public void canSetGenre() {
        Movie film = new Movie("Die Hard", "Action", 1);
        film.setGenre("Xmas");
        assertEquals("Xmas", film.getGenre());
    }


    @Test
    public void canSetRanking() {
        Movie film = new Movie("Die Hard", "Action", 1);
        film.setRanking(3);
        assertEquals(3, film.getRanking());
    }

    @Test
    public void canPrintMovieDetails() {
        Movie movie = new Movie("Die Hard", "Action", 1);
        String result = movie.toString();
        assertEquals("Title: Die Hard Genre: Action Rank: 1", result);
    }

}