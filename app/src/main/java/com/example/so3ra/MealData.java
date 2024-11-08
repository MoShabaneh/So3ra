package com.example.so3ra;

import java.util.ArrayList;
import java.util.List;

public class MealData {
    public static List<Meal> getPreWorkoutMeals() {
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal("Protein Bar", 414, "Fibers, Nuts and seeds and Flavoring", "Total Fat: 15g, Total Carbohydrates: 50g, Dietary Fiber: 5g, Sugars: 25g, Protein: 20g"));
        meals.add(new Meal("Omelette", 154, "egg, onions and oil", "Total Fat: 10g, Total Carbohydrates: 5g, Dietary Fiber: 1g, Sugars: 2g, Protein: 10g"));
        return meals;
    }

    public static List<Meal> getPostWorkoutMeals() {
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal("Iced Chocolate", 456, "Choclate bar and milk", "Total Fat: 20g, Total Carbohydrates: 45g, Dietary Fiber: 10g, Sugars: 40g, Protein: 55g"));
        meals.add(new Meal("Tuna Salad", 187, "Tuna, Bread, Onion, Salt and Lemon juice", "Total Fat: 10g, Total Carbohydrates: 20g, Dietary Fiber: 10g, Sugars: 5g, Protein: 30g"));
        return meals;
    }







}
