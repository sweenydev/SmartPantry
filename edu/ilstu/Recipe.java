package edu.ilstu;
import java.util.ArrayList;

public class Recipe 
{

	private int recipeID;
	private String name;
	private ArrayList<Ingredient> recipeIngredients = new ArrayList<Ingredient>();
	private double rating;
	
	public Recipe(String name, ArrayList<Ingredient> ingredients)
	{
		this.name = name;
		recipeIngredients = ingredients;
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
	
}