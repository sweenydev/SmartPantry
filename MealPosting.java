package com.example.steve.smartpantry;


import java.util.Calendar;


public class MealPosting {

    private int mealPostingIDCount;
    private int mealPostingID;
    private Recipe postingRecipe;
    private String name;
    private String description;
    private Calendar time;
    private String address;

    public int getMealPostingID() {
        return mealPostingID;
    }

    public Recipe getPostingRecipe() {
        return postingRecipe;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public String getAddress()
    {
        return address;
    }

    public Calendar getTime() {
        return time;
    }

    public MealPosting(Recipe postingRecipe, String name, String address)
    {
        this.postingRecipe = postingRecipe;
        this.name = name;
        this.address = address;
        time = Calendar.getInstance();
        mealPostingID = mealPostingIDCount;
        mealPostingIDCount++;

    }

}