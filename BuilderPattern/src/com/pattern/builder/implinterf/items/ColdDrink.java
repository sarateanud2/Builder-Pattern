package com.pattern.builder.implinterf.items;

import com.pattern.builder.implinterf.Wrapper;
import com.pattern.builder.interfaces.Item;
import com.pattern.builder.interfaces.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
