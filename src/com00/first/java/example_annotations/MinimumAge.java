package com00.first.java.example_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) //pasamos los elementos que se pueden anotar con esta anotación
@Retention(RetentionPolicy.RUNTIME) // Hablamos de la applicacion hasta que la anotation este disponible
public @interface MinimumAge {
    int value();
}
