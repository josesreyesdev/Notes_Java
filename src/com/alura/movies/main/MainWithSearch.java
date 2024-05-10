package com.alura.movies.main;

import com.alura.movies.models.Movie;
import com.alura.movies.models.Title;
import com.alura.movies.utils.Configuration;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la pelicula: ");
        var movieName = scanner.nextLine().trim();
        var movieResultName = movieName.replace(" ", "+%26+");

        String apiKey = Configuration.API_KEY;
        String url = "https://www.omdbapi.com/?t=" + movieResultName + "&apikey=" + apiKey;

        // REQUEST
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // RESPONSE
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println("Response => " + json);

            // Usando GSON para convertir JSON a objeto Java
            Gson gson = new Gson();
            Title movie = gson.fromJson(json, Title.class);

            System.out.println(movie);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al intentar hacer la solicitud");
            throw new RuntimeException(e);
        }
    }
}