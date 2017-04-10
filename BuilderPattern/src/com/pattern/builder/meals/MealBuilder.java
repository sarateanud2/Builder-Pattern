package com.pattern.builder.meals;

import com.pattern.builder.implinterf.items.ChickenBurger;
import com.pattern.builder.implinterf.items.Coke;
import com.pattern.builder.implinterf.items.Pepsi;
import com.pattern.builder.implinterf.items.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
