package com.alura.movies.calculate;

import com.alura.movies.models.Title;

public class CalculatorOfTime {

    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Title tittle) {
        this.totalTime += tittle.getDurationInMinutes();
    }
}
