package com01.requests.filmsStarWars.main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com01.requests.filmsStarWars.models.Film;
import com01.requests.filmsStarWars.request.RequestFilm;
import com01.requests.filmsStarWars.response.ResponseFilm;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Film> listOfMovies = new ArrayList<>();

        // Usando GSON para convertir JSON a objeto Java.
        Gson gson = getGSON();

        while (true) {
            System.out.println();

            System.out.println("Ingresa un número entre 1 a 6 para darte los detalles, " +
                    "e ingresa cualquier otro número para salir: ");
            System.out.println("1.- A New Hope");
            System.out.println("2.- The Empire Strikes Back");
            System.out.println("3.- Return of the Jedi");
            System.out.println("4.- A New Hope II");
            System.out.println("5.- Attack of the Clones");
            System.out.println("6.- Revenge of the Sith");

            int movieNumber = scanner.nextInt();

            if (movieNumber < 1 || movieNumber > 6) {
                System.out.println("Sali del programa");
                break;
            }

            String uri = "https://swapi.dev/api/films/"+ movieNumber +"/";

            try {
                //REQUEST
                RequestFilm requestFilm = new RequestFilm(uri);
                HttpClient client = requestFilm.getClient();
                HttpRequest request = requestFilm.getRequest();

                //RESPONSE
                ResponseFilm responseFilm = new ResponseFilm(client, request);
                HttpResponse<String> response = responseFilm.getResponse();

                String json = response.body();
                System.out.println("Response => " + json);

            } catch (IllegalArgumentException exception) {
                System.out.println("Error al intentar hacer la solicitud, verifique la URI");
                throw new RuntimeException(exception);
            }
        }

        System.out.println("Termino la ejecución");
    }

    private static Gson getGSON() {
        // Usando GSON para convertir JSON a objeto Java, implementar el jar del paquete GSON
        return new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
    }
}
