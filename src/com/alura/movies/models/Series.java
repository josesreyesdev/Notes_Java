package com.alura.movies.models;

public class Series extends Title{
    private int episodes;
    private int episodesPerSeason; // episodios por temporada
    private int minutesPerSeason; // minutos por temporada
    private String director;

    public Series(String name, int releaseDate) {
        super(name, releaseDate);
    }

    @Override
    public String toString() {
        return "Series: " + this.getName() + " (" +
                this.getReleaseDate() + ")" ;
    }

    @Override
    public int getDurationInMinutes() {
        return episodes * episodesPerSeason * minutesPerSeason;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerSeason() {
        return minutesPerSeason;
    }

    public void setMinutesPerSeason(int minutesPerSeason) {
        this.minutesPerSeason = minutesPerSeason;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
