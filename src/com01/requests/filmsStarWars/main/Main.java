package com01.requests.filmsStarWars.main;

import com01.requests.filmsStarWars.files.FileGenerator;
import com01.requests.filmsStarWars.models.Film;
import com01.requests.filmsStarWars.models.SearchFilm;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Film> listOfMovies = new ArrayList<>();

        Set<Integer> uniqueNumbers = new HashSet<>();

        while (true) {
            System.out.println();

            System.out.println("Ingresa un número entre 1 a 6 para darte los detalles, " +
                    "ó ingresa cualquier otro número para salir: ");
            System.out.println("1.- A New Hope");
            System.out.println("2.- The Empire Strikes Back");
            System.out.println("3.- Return of the Jedi");
            System.out.println("4.- A New Hope II");
            System.out.println("5.- Attack of the Clones");
            System.out.println("6.- Revenge of the Sith");
            System.out.println();

            if (scanner.hasNextInt()) {
                int movieNumber = scanner.nextInt();

                if (movieNumber < 1 || movieNumber > 6) {
                    System.out.println("Salir del programa");
                    break;
                }

                if (!uniqueNumbers.contains(movieNumber)) {
                    uniqueNumbers.add(movieNumber);

                    SearchFilm searchFilm = new SearchFilm();
                    Film miFilm = searchFilm.searchMovie(movieNumber);

                    System.out.println("My Film: " + miFilm);

                    listOfMovies.add(miFilm);
                } else {
                    System.out.println("¡Ya has ingresado ese número!");
                }

            } else {
                System.out.println("Entrada inválida. Por favor, ingresa un número.");
                scanner.next(); // Limpiar la entrada del scanner
            }
        }

        System.out.println(listOfMovies);

        // Escribir un archivo a json
        FileGenerator generator = new FileGenerator();
        generator.getFileWriter(listOfMovies, "films");

        System.out.println("Termino la ejecución");
    }
}
