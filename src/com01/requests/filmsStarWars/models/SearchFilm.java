package com01.requests.filmsStarWars.models;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SearchFilm {

    public Film searchMovie(int movieNumber) {

        String uri = "https://swapi.dev/api/films/" + movieNumber + "/";

        //REQUEST
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        //RESPONSE
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println("Response => " + json);

            // JSON convert to Film
            return new Gson().fromJson(json, Film.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
