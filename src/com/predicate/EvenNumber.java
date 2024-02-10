package com.predicate;

import java.util.function.Predicate;

public class EvenNumber {

	public static void main(String[] args)
	{
	     Predicate<Integer> evenNumber= i-> i%2==0;
	     System.out.println(evenNumber.test(10));

	}

}
