package com.example.so3ra;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MealDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_details);

        TextView mealName = findViewById(R.id.mealName);
        TextView mealCalories = findViewById(R.id.mealCalories);
        TextView mealIngredients = findViewById(R.id.mealIngredients);
        TextView mealNutritionalInfo = findViewById(R.id.mealNutritionalInfo);

        String meal = getIntent().getStringExtra("meal");
        String[] mealDetails = meal.split(" - ");
        mealName.setText(mealDetails[0]);
        mealCalories.setText(mealDetails[1] );

        String mealDetailsExtra = getIntent().getStringExtra("mealDetails");
        String[] mealDetailsExtraArray = mealDetailsExtra.split(" - ");
        mealIngredients.setText("Ingredients: " + mealDetailsExtraArray[2]);
        mealNutritionalInfo.setText("Nutritional Info: " + mealDetailsExtraArray[3]);





    }
}