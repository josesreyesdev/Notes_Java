package com.alura.movies.calculate;

import com.alura.movies.models.Classification;

public class RecommendationFilter {

    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("Buena evaluación en el momento");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Popular en el momento");
        } else System.out.println("Agregalo a tu lista, es buena recomendación");
    }
}
