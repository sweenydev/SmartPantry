package com.example.steve.smartpantry;

import java.util.ArrayList;

public class Recipe
{
    private static int recipeIDCount;
    private int recipeID;
    private String name;
    private ArrayList<Ingredient> recipeIngredients = new ArrayList<Ingredient>();
    private double rating;

    public Recipe(String name, ArrayList<Ingredient> ingredients)
    {
        this.name = name;
        recipeIngredients = ingredients;
        recipeID = recipeIDCount;
        recipeIDCount++;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Ingredient> getRecipeIngredients()
    {
        return recipeIngredients;
    }

    public boolean contains(Ingredient ingredient)
    {
        boolean isPossible = true;
        for(int ingredientCount = 0; ingredientCount < recipeIngredients.size(); ingredientCount++)
        {
            if(!(recipeIngredients.get(ingredientCount).equals(ingredient)))
            {
                isPossible = false;
                ingredientCount = recipeIngredients.size() + 2;
            }
        }
        return isPossible;
    }

}