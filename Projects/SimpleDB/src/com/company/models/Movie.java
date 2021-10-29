package com.company.models;

public class Movie {

    private int id;
    private String title;
    private String releaseYear;
    private String rating;

    public Movie(int id, String title, String releaseYear, String rating) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString(){
        return "The movie with an id of " + id + " and called " + title  + " was released in " + releaseYear + " and is rated " + rating + ".";
    }
}
