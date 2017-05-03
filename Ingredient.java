package com.example.steve.smartpantry;

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