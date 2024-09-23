package com.alura.movies.main;

import com.alura.movies.models.Movie;
import com.alura.movies.models.Series;
import com.alura.movies.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainWithLists {
    public static void main(String[] args) {

        Movie movie1 = new Movie("La Familia del Futuro", 2007);
        movie1.evaluation(7);

        var movie2 = new Movie("El caballo indomable", 2005);
        movie2.evaluation(9.5);

        var movie3 = new Movie("Señor de los anillos", 2001);
        movie3.evaluation(8);

        Series series1 = new Series("24 Horas", 1995);
        series1.evaluation(10);

        Series series2 = new Series("Vikings", 2013);
        series2.evaluation(10);
        series2.setDirector("Michael Hirst");
        series2.setEpisodesPerSeason(89);
        series2.setEpisodes(6);

        List<Title> watchedList = new ArrayList<>();
        watchedList.add(movie1);
        watchedList.add(movie2);
        watchedList.add(movie3);
        watchedList.add(series1);
        watchedList.add(series2);

        watchedList.forEach(it -> System.out.println(it.toString()));

        System.out.println();

        for (Title item: watchedList) {
            //System.out.println(item.toString());
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClassification() > 3) {
                System.out.println(" => Classification: " + movie.getClassification());
            }
        }

        /* ****************** */
        System.out.println();
        System.out.println("No sorted titles: " + watchedList);
        Collections.sort(watchedList);
        System.out.println("Sorted titles: " + watchedList);

        System.out.println();
        System.out.println("No sorted titles per date: " + watchedList);
        watchedList.sort(Comparator.comparing(Title::getReleaseDate)); // ordenando por fecha de lanzamiento
        System.out.println("Sorted titles per date: " + watchedList);
    }
}
