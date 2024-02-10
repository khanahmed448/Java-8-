package com.bifunction;

import java.util.function.BiFunction;

public class Mint {

	public static void main(String[] args) 
	{
		BiFunction<String, String, Integer> biFunction=(x,y)-> x.length()+y.length();
		System.out.println(biFunction.apply("Mohd", "Khan"));
		

		BiFunction<String, String, String> biFunction1=(x,y)->((x.substring(0,3))+ (y.substring(2,4)));
		System.out.println(biFunction1.apply("Mohd", "Khan"));

	}

}
