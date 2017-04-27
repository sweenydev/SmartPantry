public class Ingredient 
{

	private int ingredientID;
	private String name;
	private double avgPrice;
	private int quantity;
	
	public int getId()
	{
		return ingredientID;
	}
	
	public int getQuantity()
	{
		return quantity;
		
	}
	
	public void changeQuantity(int amount)
	{
		quantity = amount;
	}
	
	public boolean equals(Ingredient ingredient)
	{
		if((ingredientID == ingredient.getId() && (quantity == ingredient.getQuantity())))
		{
			return true;	
		}
		else
		{
			return false;
		}
	}
	
}