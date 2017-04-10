package com.pattern.builder.main;

import com.pattern.builder.meals.Meal;
import com.pattern.builder.meals.MealBuilder;

public class MealBuilderPattern {
	public static void main(String args[]){
		MealBuilder mealBuilder = new MealBuilder();
	
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
	}
}
