package com.alura.movies.models;

import com.alura.movies.calculate.Classification;

public class Movie extends Title implements Classification {

    private String director;

    public Movie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) (calculateMedia() / 2);
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" +
                this.getReleaseDate() + ")" ;
    }
}
