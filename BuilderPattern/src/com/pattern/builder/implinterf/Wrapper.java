package com.pattern.builder.implinterf;

import com.pattern.builder.interfaces.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
