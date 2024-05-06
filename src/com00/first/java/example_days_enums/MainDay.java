package com00.first.java.example_days_enums;

public class MainDay {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println("Day of the week is: "+ day);
        }
        System.out.println();

        Day sunday = Day.SUNDAY;
        System.out.println("Day: "+ sunday);
        System.out.println("Specific day is: "+ sunday.name());
        System.out.println("Ordinal: "+ sunday.ordinal());
        System.out.println("Convert to String: " + sunday.toString());
    }
}