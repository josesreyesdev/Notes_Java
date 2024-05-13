package com01.requests.filmsStarWars.models;

import java.util.List;

public record FilmDto(
        String title,
        int episodeId,
        String openingCrawl,
        String director,
        String producer,
        String releaseDate,
        List<String>characters,
        List<String> planets,
        List<String> starships,
        List<String> vehicles,
        List<String> species,
        String created,
        String edited,
        String url
) {
}
