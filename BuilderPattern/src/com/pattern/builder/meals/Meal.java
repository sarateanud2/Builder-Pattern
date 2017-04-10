package com.pattern.builder.meals;

import java.util.ArrayList;
import java.util.List;

import com.pattern.builder.interfaces.Item;

public class Meal {
	private List<Item> items = new ArrayList<>();
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public float getCost(){
		float cost = 0.0f;
		
		for(Item it : items){
			cost += it.price();
		}
		return cost;
	}
	
	public void showItems(){
		for(Item it : items){
			System.out.println("Item: " + it.name());
			System.out.println("Packing: " + it.packing());
			System.out.println("Price: " + it.price());
		}
	}
}	
