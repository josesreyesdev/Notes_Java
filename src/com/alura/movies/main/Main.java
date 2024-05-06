package com.alura.movies.main;

import com.alura.movies.calculate.CalculatorOfTime;
import com.alura.movies.calculate.RecommendationFilter;
import com.alura.movies.models.Episode;
import com.alura.movies.models.Movie;
import com.alura.movies.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("La Familia del Futuro", 2007);
        movie1.setDurationInMinutes(95);
        movie1.setIncludedInThePlan(true);

        movie1.showTechnicalData();
        movie1.evaluation(10);
        movie1.evaluation(10);
        movie1.evaluation(7.8);
        System.out.println("Total de Evaluaciones: " + movie1.getTotalEvaluations());
        System.out.println("Media Evaluaciones: " + movie1.calculateMedia());

        /* ******************************************** */
        Series s24hrs = new Series("24 Hrs", 1995);
        s24hrs.setEpisodes(10);
        s24hrs.setMinutesPerSeason(40);
        s24hrs.setEpisodesPerSeason(24);
        s24hrs.setIncludedInThePlan(false);
        System.out.println();
        s24hrs.showTechnicalData();

        /* ******************************************** */
        CalculatorOfTime calculator = new CalculatorOfTime();
        calculator.include(s24hrs);
        calculator.include(movie1);
        System.out.println();
        System.out.println("Total de tiempo para ver mis peliculas y series es de: " + calculator.getTotalTime() + " minutos");

        System.out.println();
        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(movie1);

        /* ******************************************** */
        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("El ayer y hoy");
        episode.setSerie(s24hrs);
        episode.setTotalVisualization(50);

        recommendationFilter.filter(episode);

        /* ******************************************** */
        var movie2 = new Movie("El caballo indomable", 2005);
        movie2.setDirector("Brais Moure");
        movie2.setDurationInMinutes(180);

        /* ******************************************** */
        var movie3 = new Movie("Señor de los anillos", 2001);
        movie3.setDirector("Brais Willis");
        movie3.setDurationInMinutes(180);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);

        System.out.println();
        System.out.println("Tamaño de mi lista: " + movieList.size());
        System.out.println("La primera pelicula que tengo es: " + movieList.get(0).getName());

        movieList.forEach(item -> System.out.println(item.toString()));
        System.out.println("-------------------");
        movieList.forEach(System.out::println);
    }
}