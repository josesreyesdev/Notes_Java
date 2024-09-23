package com.alura.movies.models;

import com.alura.movies.exceptions.ErrorToConvertDurationException;

import java.util.Comparator;

public class Title implements Comparable<Title>, Comparator<Title> {

    private final String name;
    private final int releaseDate;
    private int durationInMinutes;
    private boolean includedInThePlan;
    private double sumEvaluations;
    private int totalEvaluations;

    public Title(TitleDto titleDto) {

        this.name = titleDto.title();
        this.releaseDate = Integer.parseInt(titleDto.year());

        if (titleDto.runtime().contains("N/A")) {
            throw new ErrorToConvertDurationException("No pude convertir la duración por contener N/A");
        } else  {
            this.durationInMinutes = Integer.parseInt(titleDto.runtime()
                    .substring(0, 3) // convirtiendo los primeros 3 digitos a numero
                    .replace(" ", "")); // en caso de tener solo dos digitos reemplazo el space por nada
        }
    }

    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public int getTotalEvaluations() {
        return totalEvaluations;
    }

    public void showTechnicalData() {
        System.out.println("Nombre de la Película: " + name);
        System.out.println("Fecha de Lanzamiento: " + releaseDate);
        System.out.println("Duración en Minutos: " + getDurationInMinutes());
    }

    public void evaluation(double note) {
        sumEvaluations += note;
        totalEvaluations++;
    }

    public double calculateMedia() {
        return sumEvaluations / totalEvaluations;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "(name = " + name +
                ", release_date = " + releaseDate +
                ", durationInMinutes = " + durationInMinutes + " minutes)";
    }

    @Override
    public int compare(Title o1, Title o2) {
        return o1.name.compareTo(o2.name);
    }
}
