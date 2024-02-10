package com.unaryoperator;

import java.util.function.UnaryOperator;

public class Smash {

	public static void main(String[] args) 
	{
		UnaryOperator<Integer> unaryOperator = num->num+num;
		System.out.println(unaryOperator.apply(10));
		
		UnaryOperator<String> unaryOperator2=str->str.toUpperCase();
		System.out.println(unaryOperator2.apply("ahmed"));

	}

}
