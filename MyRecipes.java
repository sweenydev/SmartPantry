package edu.ilstu;
import java.util.ArrayList;

public class MyRecipes {

	private ArrayList<Recipe> recipeList = new ArrayList<Recipe>();
	
	
	private void addRecipe(Recipe recipe)
	{
		recipeList.add(recipe);
	}
	
	private void editRecipe(Recipe recipe)
	{
		
	}
	
	private void deleteRecipe(Recipe recipe)
	{
		int recipeID = recipe.getRecipeID();
		
				
	}
	
	
	public ArrayList<Recipe> getPossibleRecipes(ArrayList<Ingredient> ingredientList)
	{
		ArrayList<Recipe> recipesPossible = new ArrayList<Recipe>();
		for(int recipeCount = 0; recipeCount < recipeList.size(); recipeCount++) //Cycles through all recipes in recipeList
		{
			boolean isPossible = true;
			for(int ingredientCount = 0; ingredientCount < ingredientList.size(); ingredientCount++) //Cycles through all ingredients in ingredientList
			{
				if(!(recipeList.get(recipeCount).contains(ingredientList.get(ingredientCount))))
				{
					isPossible = false;
					ingredientCount = ingredientList.size() + 2;//Prevents recipe from checking for any further ingredient matches and moves onto next recipe
				}
			}
			if(isPossible)
			{
				recipesPossible.add(recipeList.get(recipeCount));
			}
		}
		return recipesPossible;
	}
	
}