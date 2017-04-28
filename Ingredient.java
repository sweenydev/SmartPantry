public class Ingredient 
{

	private int ingredientID;
	private String name;
	private String foodGroup;
	private double avgPrice;
	private int quantity;
	
	public Ingredient(String name, int quantity)
	{
		this.name = name;
		this.quantity = quantity;
	}
	
	public Ingredient(String name, int quantity, String foodGroup)
	{
		this.name = name;
		this.quantity = quantity;
		this.foodGroup = foodGroup;
	}
	
	public int getId()
	{
		return ingredientID;
	}
	
	public int getQuantity()
	{
		return quantity;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getFoodGroup()
	{
		return foodGroup;
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