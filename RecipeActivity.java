package com.example.steve.smartpantry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        LinearLayout mLayout = (LinearLayout)findViewById(R.id.activity_recipe);

        //Recipe currentRecipe = new Recipe(); // Recipe being viewed generates here
        Recipe currentRecipe = new Recipe("name", new ArrayList<Ingredient>());
        TextView recipeName = new TextView(this);
        recipeName.setText(currentRecipe.getName());
        recipeName.setTextSize(50);
        recipeName.setPadding(0, 16, 0, 16);
        mLayout.addView(recipeName);

        TextView ingredientView = new TextView(this);
        ingredientView.setText("Ingredients: ");
        ingredientView.setTextSize(40);
        mLayout.addView(ingredientView);

        RatingBar mRatingBar = (RatingBar)findViewById(R.id.rating);
        mRatingBar.setRating(Float.parseFloat(String.valueOf(currentRecipe.getRating())));// Probably not the best way to do this

        ArrayList<Ingredient> ingredientList = currentRecipe.getRecipeIngredients();
        TextView[] ingredientListView = new TextView[ingredientList.size()];

        final Button favoriteButton = (Button)findViewById(R.id.recipe_favorite_button);
        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(favoriteButton.getText().equals("Favorite"))
                {
                    favoriteButton.setText("Unfavorite");
                }
                else
                {
                    favoriteButton.setText("Favorite");
                }
            }
        });

        for(int count = 0; count < ingredientListView.length; count++)
        {
            ingredientListView[count]= new TextView(this);
            ingredientListView[count].setText("- " + ingredientList.get(count).getName());
            ingredientListView[count].setTextSize(30);
            mLayout.addView(ingredientListView[count]);
        }

        Intent intent = new Intent(RecipeActivity.this, RecipeActivity.class); //Not sure about how Intent should be handled once placed with other activities
        startActivity(intent);

    }
}