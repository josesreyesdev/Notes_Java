package com01.requests.filmsStarWars.files;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com01.requests.filmsStarWars.models.Film;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileGenerator {

    public void getFileWriter(List<Film> listOfMovies, String nameFile) {
        try {
            FileWriter writer = new FileWriter(nameFile + ".json");
            writer.write(getGSON().toJson(listOfMovies));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Gson getGSON() {
        // Usando GSON para convertir JSON a objeto Java, implementar el jar del paquete GSON
        return new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
    }
}
