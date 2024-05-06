package com00.first.java.variablesType;

public class Conditionals {
    public void conditionals() {
        int age = 17;
        int totalPeople = 2;

        boolean isPareja = totalPeople > 1;

        if (age >= 18 || isPareja) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("Eres menor de edad, tienes: " + age + " años");
        }
    }

    public void switchControl() {
        String month = "Enero";
        String valueMonth = switch (month) {
            case "Enero" -> "Empezando el año";
            case "September" -> "Mes de Cumpleaños";
            case "December" -> "Mes de Navidad";
            default -> "Random month";
        };
        System.out.println(valueMonth);
    }
}
