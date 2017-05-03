package com.example.steve.smartpantry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MealPostingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_posting);

        LinearLayout mLayout = (LinearLayout)findViewById(R.id.activity_meal_posting);

        MealPosting currentPosting = new MealPosting(); // Set current meal posting here
        Recipe recipeDisplayed = currentPosting.getPostingRecipe();

        TextView postTitle = (TextView)findViewById(R.id.meal_posting_title);
        postTitle.setText(currentPosting.getName());
        mLayout.addView(postTitle);

        TextView postAddress = (TextView)findViewById(R.id.meal_posting_address);
        postAddress.setText(currentPosting.getAddress());
        mLayout.addView(postAddress);

        TextView postTime = (TextView)findViewById(R.id.meal_posting_time);
        postTime.setText(String.valueOf(currentPosting.getTime()));
        mLayout.addView(postTime);

        TextView postRecipe = (TextView)findViewById(R.id.meal_posting_recipe);
        postRecipe.setText(recipeDisplayed.getName());
        mLayout.addView(postRecipe);

        TextView postDescription = (TextView)findViewById(R.id.meal_posting_description);
        postDescription.setText(currentPosting.getDescription());
        mLayout.addView(postDescription);

        final Button rsvpButton = (Button)findViewById(R.id.meal_posting_rsvp_button);
        rsvpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rsvpButton.getText().equals("RSVP"))
                {
                    rsvpButton.setText("UNDO");
                }
                else
                {
                    rsvpButton.setText("RSVP");
                }
            }
        });

    }
}
