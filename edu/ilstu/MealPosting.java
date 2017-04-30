package edu.ilstu;

import java.util.Calendar;


public class MealPosting {
	
	private int mealPostingIDCount;
	private int mealPostingID;
	private Recipe postingRecipe;
	private String name;
	
	public int getMealPostingID() {
		return mealPostingID;
	}

	public Recipe getPostingRecipe() {
		return postingRecipe;
	}

	public String getName() {
		return name;
	}

	private Calendar time;
	
	public Calendar getTime() {
		return time;
	}

	public MealPosting(Recipe postingRecipe, String name)
	{
		this.postingRecipe = postingRecipe;
		this.name = name;
		time = Calendar.getInstance();
		mealPostingID = mealPostingIDCount;
		mealPostingIDCount++;
		
		
	}

}
