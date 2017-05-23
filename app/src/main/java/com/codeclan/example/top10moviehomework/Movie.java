package com.codeclan.example.top10moviehomework;

import android.service.notification.NotificationListenerService;

/**
 * Created by user on 22/05/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int ranking;


    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }


    public int getRanking() {
        return this.ranking;
    }


    public String setTitle(String title) {
        return this.title = title;
    }

    public String setGenre(String genre) {
        return this.genre = genre;
    }

    public int setRanking(int ranking) {
        return this.ranking = ranking;
    }

    @Override
    public String toString() {
    return "Title: " + this.title + " Genre: " + this.genre + " Rank: " + this.ranking;
    }
}
