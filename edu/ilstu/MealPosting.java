package edu.ilstu;

import java.util.Calendar;


public class MealPosting {
	
	private Recipe postingRecipe;
	private String name;
	private Calendar time;
	
	public Calendar getTime() {
		return time;
	}

	public MealPosting(Recipe postingRecipe, String name)
	{
		this.postingRecipe = postingRecipe;
		this.name = name;
		time = Calendar.getInstance();
		
		
	}

}
