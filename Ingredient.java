package edu.ilstu;
public class Ingredient 
{

	private static int ingredientIDCount = 1;
	private int ingredientID;
	private String name;
	private String foodGroup;
	private double price;
	private double avgPrice;
	private int quantity;
	
	public Ingredient(String name, int quantity)
	{
		this.name = name;
		this.quantity = quantity;
		ingredientID = ingredientIDCount;
		ingredientIDCount++;
	}
	
	
	public Ingredient(String name, int quantity, String foodGroup)
	{
		this.name = name;
		this.quantity = quantity;
		this.foodGroup = foodGroup;
		ingredientID = ingredientIDCount;
		ingredientIDCount++;
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
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setFoodGroup(String foodGroup) {
		this.foodGroup = foodGroup;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}