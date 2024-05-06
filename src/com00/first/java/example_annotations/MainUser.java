package com00.first.java.example_annotations;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class MainUser {
    public static void main(String[] args) {
        User user = new User(
                "Maria",
                "42198284863",
                LocalDate.of(2010, Month.JANUARY, 13)
        );
        System.out.println("Is valid user: "+ isValid(user));
        System.out.println();

        User user1 = new User(
                "Maria",
                "42198284863",
                LocalDate.of(2000, Month.JANUARY, 13)
        );
        System.out.println("Is valid user: "+ isValid(user1));
    }

    //Creando un generics para validar cualquier tipo de user
    /*private static <T> boolean isValid(T object) {
        Class<?> genericClass = object.getClass(); //tomamos info del objeto que recibimos
        //Averiguamos que atributo esta anotado iterando
        for (Field field : genericClass.getDeclaredFields()) {
            // Comprobamos si el campo contiene la anotación pasada
            if (field.isAnnotationPresent(MinimumAge.class)){
                //Comparamos la edad minima pasado en la anotacion
                MinimumAge minimumAge = field.getAnnotation(MinimumAge.class);
                try {
                    //Acceder al valor de un atributo private, necesitamos decir que esta accesible de la sig manera
                    field.setAccessible(true);
                    //Obtenemos el valor del atributo anotado
                    LocalDate dateOfBirth = (LocalDate) field.get(object);
                    //Comprobamos si la fecha de nacimiento y la fecha actual es mayor o igual al de la edad minima anotada
                    return Period.between(dateOfBirth, LocalDate.now()).getYears() >= minimumAge.value();
                } catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return false;
    } */
    private static <T> boolean isValid(T object) {
        Class<?> genericClass = object.getClass();
        for (Field field : genericClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(MinimumAge.class)){
                MinimumAge minimumAge = field.getAnnotation(MinimumAge.class);
                try {
                    field.setAccessible(true);
                    LocalDate dateOfBirth = (LocalDate) field.get(object);
                    return Period.between(dateOfBirth, LocalDate.now()).getYears() >= minimumAge.value();
                } catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return false;
    }
}
