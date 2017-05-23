package com.codeclan.example.top10moviehomework;

import java.util.ArrayList;

/**
 * Created by user on 22/05/2017.
 */

public class Ranking {
    private ArrayList<Movie> topTen;


    public Ranking(){
        this.topTen = new ArrayList<>();
    }

    public int getNumberOfMovies() {
        return this.topTen.size();
    }

    public void add(Movie movie) {
        this.topTen.add(movie);
    }

    public void remove(Movie movie) {
        int lastMovie = topTen.size();
        this.topTen.remove(lastMovie - 1);
    }


    public String getMovieByRank(int rank) {
        int indexPosition = rank - 1;
        return this.topTen.get(indexPosition).toString();

    }
}
