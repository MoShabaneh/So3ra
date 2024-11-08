package com.example.so3ra;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MealSelectionActivity extends AppCompatActivity {

    private ArrayAdapter<Meal> adapter;
    private List<Meal> mealsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_selection);

        TextView header = findViewById(R.id.header);
        ListView mealListView = findViewById(R.id.mealListView);


        String workoutType = getIntent().getStringExtra("workoutType");
        header.setText(workoutType + " Meals");

        if (workoutType.equals("Pre_Workout")) {
            mealsList = MealData.getPreWorkoutMeals();
        } else {
            mealsList = MealData.getPostWorkoutMeals();
        }

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mealsList);
        mealListView.setAdapter(adapter);

        mealListView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MealSelectionActivity.this, MealDetailsActivity.class);
            intent.putExtra("meal", mealsList.get(position).toString());
            intent.putExtra("mealDetails", mealsList.get(position).getMealDetails());
            startActivity(intent);
        });


    }
}