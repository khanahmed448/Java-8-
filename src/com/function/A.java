package com.function;

import java.util.function.Function;

public class A {

	public static void main(String[] args)
	{
		Function<String,Integer> function1 = name -> name.length();
		System.out.println(function1.apply("Mohammad"));
		
		Function<String,String> function2 = x -> x.substring(0, 4);
		System.out.println(function2.apply("Mohammad"));

	}

}
