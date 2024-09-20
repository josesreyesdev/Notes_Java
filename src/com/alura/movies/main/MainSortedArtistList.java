package com.alura.movies.main;

import java.util.ArrayList;
import java.util.Collections;

public class MainSortedArtistList {
    public static void main(String[] args) {

        /* Ordenamiento de listas primitivas */
        ArrayList<String> artistsList = new ArrayList<>();
        artistsList.add("Penelope Cruz");
        artistsList.add("Antonio Banderas");
        artistsList.add("Ricardo Darin");

        System.out.println();
        System.out.println("Artistas no ordenados" + artistsList);

        Collections.sort(artistsList);
        System.out.println("Artistas ordenados   " + artistsList);
    }
}
