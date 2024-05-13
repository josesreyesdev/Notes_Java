package com.alura.movies.main;

import com.alura.movies.exceptions.ErrorToConvertDurationException;
import com.alura.movies.models.Title;
import com.alura.movies.models.TitleDto;
import com.alura.movies.utils.Configuration;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la pelicula: ");
        var movieName = scanner.nextLine().trim();

        String encodedMovieName = URLEncoder.encode(movieName, StandardCharsets.UTF_8);
        String movieResultName = encodedMovieName.replace("+", "%20");

        String apiKey = Configuration.API_KEY;
        String url = "https://www.omdbapi.com/?t=" + movieResultName + "&apikey=" + apiKey;

        // REQUEST
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // RESPONSE
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println("Response => " + json);

            // Usando GSON para convertir JSON a objeto Java, implementar el jar del paquete GSON
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TitleDto myMovieDto = gson.fromJson(json, TitleDto.class);
            System.out.println(myMovieDto);

            try {
                Title myMovie = new Title(myMovieDto);

                System.out.println("Title ya convertido: " + myMovie);

                // Escribir un archivo
                FileWriter writer = new FileWriter("movies.txt");
                writer.write(myMovie.toString());
                writer.close();
            } catch (NumberFormatException exception) {
                System.out.println("Excepcion al querer transformar un valor a Title => " + exception.getMessage());
            }

            System.out.println("Finalizó la ejecución");
        } catch (IOException | InterruptedException | IllegalArgumentException e) {
            System.out.println("Error al intentar hacer la solicitud, verifique la URI");
            throw new RuntimeException(e);
        } catch (ErrorToConvertDurationException ex) {
            System.out.println(ex.getMessage());
        }
    }
}