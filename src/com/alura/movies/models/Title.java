package com.alura.movies.models;

public class Title implements Comparable<Title> {
    private String name;
    private int releaseDate;
    private int durationInMinutes;
    private boolean includedInThePlan;
    private double sumEvaluations;
    private int totalEvaluations;

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

}
