package edu.ilstu;
import java.util.ArrayList;

public class Recipe 
{
	private static int recipeIDCount;
	private int recipeID;
	private String name;
	private ArrayList<Ingredient> recipeIngredients = new ArrayList<Ingredient>();
	private double rating;
	private boolean isVegetarian;
	private String mealType;
	private int time;
	
	public int getTime() {
		return time;
	}

	public boolean isVegetarian() {
		return isVegetarian;
	}

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

	public String getMealType() {
		return mealType;
	}

	
}