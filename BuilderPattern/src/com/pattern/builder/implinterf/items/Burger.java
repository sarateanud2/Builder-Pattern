package com.pattern.builder.implinterf.items;

import com.pattern.builder.implinterf.Buttle;
import com.pattern.builder.interfaces.Item;
import com.pattern.builder.interfaces.Packing;

public abstract class Burger implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		
		return new Buttle();
	}

	@Override
	public abstract float price();

}
