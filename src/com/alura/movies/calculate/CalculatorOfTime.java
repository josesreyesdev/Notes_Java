package com.alura.movies.calculate;

import com.alura.movies.models.Title;

public class CalculatorOfTime {

    private String totalTime;

    public String getTotalTime() {
        return totalTime;
    }

    public void include(Title tittle) {
        this.totalTime += tittle.getDurationInMinutes();
    }
}
