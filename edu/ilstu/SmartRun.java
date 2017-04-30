package edu.ilstu;

import java.util.ArrayList;

public class SmartRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ingredient one = new Ingredient("sour cream", 1);
		Ingredient two = new Ingredient("icing", 1);
		ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();
		ingredientList.add(one);
		ingredientList.add(two);
		Recipe myRecipe = new Recipe("My Recipe", ingredientList);
		MealPosting myMP = new MealPosting(myRecipe, "hey you guys");
		System.out.println(myMP.getTime());
		
	}

}
