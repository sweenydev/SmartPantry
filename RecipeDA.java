package edu.ilstu;
import java.util.ArrayList;

public class RecipeDA
{
	private static ArrayList<Recipe> recipeList;
	
	
	public RecipeDA()
	{
		recipeList = new ArrayList<Recipe>();
	}
	
	public static Recipe getRecipe(int recipeID)
	{
		for(int userCount = 0; userCount < recipeList.size(); userCount++)
		{
			if(recipeList.get(userCount).getRecipeID() == recipeID)
			{
				return recipeList.get(userCount);
			}
		}
		return null;//Returns nothing if there are no matches
	}
	
	public void addRecipe(Recipe recipe)
	{
		int recipeBuffer = recipe.getRecipeID();
		
		if(getRecipe(recipeBuffer) == null)
		{
			recipeList.add(recipe);
		}
	}
	
	
	public void removeRecipe(Recipe recipe)
	{
		
		for(int userCount = 0; userCount < recipeList.size(); userCount++)
		{
			if(recipeList.get(userCount).getRecipeID()== recipe.getRecipeID())
			{
				recipeList.remove(userCount);
			}
		}	
	}
	
	public static ArrayList<Recipe> getRecipeList() {
		return recipeList;
	}
}

