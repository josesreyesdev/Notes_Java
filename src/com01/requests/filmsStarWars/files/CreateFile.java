package com01.requests.filmsStarWars.files;

import com.google.gson.Gson;
import com01.requests.filmsStarWars.models.Film;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateFile {

    private List<Film> listOfMovies;
    private Gson gson;

    public CreateFile(List<Film> listOfMovies, Gson gson) {
        this.listOfMovies = listOfMovies;
        this.gson = gson;
    }

    public void getFileWriter(String nameFile) {
        try {
            FileWriter writer = new FileWriter(nameFile + ".json");
            writer.write(gson.toJson(listOfMovies));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
