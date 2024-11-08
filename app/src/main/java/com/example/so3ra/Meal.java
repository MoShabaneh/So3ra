package com.example.so3ra;

public class Meal {
    private String name;
    private int calories;
    private String ingredients;
    private String nutritionalInfo;

    public Meal(String name, int calories, String ingredients, String nutritionalInfo) {
        this.name = name;
        this.calories = calories;
        this.ingredients = ingredients;
        this.nutritionalInfo = nutritionalInfo;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getNutritionalInfo() {
        return nutritionalInfo;
    }

    @Override
    public String toString() {
        return name + " - " + calories + " Kcal";
    }

    public String getMealDetails() {
        return name + " - " + calories + " Kcal" + " - " + ingredients + " - " + nutritionalInfo;
    }
}