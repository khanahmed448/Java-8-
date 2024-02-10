package com.bipredicate;

import java.util.function.BiPredicate;

public class OverBiBredicate {

	public static void main(String[] args) 
	{
		BiPredicate<String,Integer> biPredicate=(x,y)-> x.startsWith("Ah") && y!=10;
        System.out.println(biPredicate.test("Ahmed",5));
	}

}
