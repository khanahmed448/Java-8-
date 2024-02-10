package com.function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) 
	{
		Function<String, String> function1 = name->name.toUpperCase();
		Function<String, String> function2 = x->x.substring(0,3);
		
		System.out.println(function1.andThen(function2).apply("arman"));

	}

}
