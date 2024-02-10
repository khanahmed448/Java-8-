package com.bifunction;

import java.util.function.BiFunction;

public class Happy {

	public static void main(String[] args) 
	{
		BiFunction<Integer, String, Integer> biFunction = (x,y) -> x + y.length();
		System.out.println(biFunction.apply(10, "null"));

	}

}
