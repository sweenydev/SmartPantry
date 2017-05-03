package com.example.srliebi.smartpantry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        LinearLayout mLayout = (LinearLayout)findViewById(R.id.activity_recipe);
        ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();
        ingredientList.add(new Ingredient("Ground beef", 1));
        ingredientList.add(new Ingredient("Carrot", 1));
        ingredientList.add(new Ingredient("Salt", 1));

        Recipe currentRecipe = new Recipe("Example", ingredientList);
        TextView recipeName = new TextView(this);
        recipeName.setText(currentRecipe.getName());
        TextView[] ingredientListView = new TextView[ingredientList.size()];

        for(int count = 0; count < ingredientListView.length; count++)
        {
            ingredientListView[count]= new TextView(this);
            ingredientListView[count].setText(ingredientList.get(count).getName());
            mLayout.addView(ingredientListView[count]);
        }

    }
}
