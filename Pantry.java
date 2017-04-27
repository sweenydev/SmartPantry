import java.util.ArrayList;

public class Pantry 
{
	
	private ArrayList<Ingredient> userIngredients;
	
	public Pantry()
	{
		userIngredients = new ArrayList<Ingredient>();
	}
	
	private void addIngredient(int ingredientID)
	{
		
	}
	
	private void removeIngredient(int ingredientID)
	{
		for(int ingredientCount = 0; ingredientCount < userIngredients.size(); ingredientCount++)
		{
			if(userIngredients.get(ingredientCount).getId() == ingredientID)
			{
				userIngredients.remove(ingredientCount);
			}
		}
	}
	
	private void editIngredient(int ingredientID)
	{
		//Should bring user to new interface
	}
	
	public ArrayList<Ingredient> getIngredients()
	{
		return userIngredients;
	}
	
	public boolean contains(Ingredient ingredient)
	{
		for(int ingredientCount = 0; ingredientCount < userIngredients.size(); ingredientCount++)
		{
			if(userIngredients.get(ingredientCount).equals(ingredient))
			{
				return true;
			}
		}
		return false; //Returns false if ingredient does not match any ingredients in pantry
	}

}