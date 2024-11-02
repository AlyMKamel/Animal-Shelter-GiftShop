package com.example.animalapp;

public class SharedData {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        SharedData.name = name;
    }
}
