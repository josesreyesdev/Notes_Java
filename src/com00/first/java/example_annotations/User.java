package com00.first.java.example_annotations;

import java.time.LocalDate;
import java.time.Period;

public class User {
    private String name;
    private String identity;
    @MinimumAge(value = 18)
    private LocalDate dateOfBirth; //fecha de Nacimiento

    public User(String name, String identity, LocalDate localDate) {
        this.name = name;
        this.identity = identity;
        this.dateOfBirth = localDate;
    }

    public String getName() {
        return name;
    }

    public String getIdentity() {
        return identity;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isValidUser(User user) {
        // Name contains only letters
        if (!user.getName().matches("[a-zA-Záàâãéèêíïóôõöúçñ\\s]+")) {
            return false;
        }

        // Identity contains only numbers
        if(!user.getIdentity().matches("[^0-9]+")){
            return false;
        }

        // User tiene al menos 18 años
        return Period.between(user.getDateOfBirth(), LocalDate.now()).getYears() >= 18;
    }
}
