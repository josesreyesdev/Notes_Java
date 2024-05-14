package com01.requests.filmsStarWars.models;

public record Film(
        String title,
        int episode_id,
        String opening_crawl,
        String director,
        String producer,
        String release_date,
        String created,
        String edited,
        String url
) {
}
