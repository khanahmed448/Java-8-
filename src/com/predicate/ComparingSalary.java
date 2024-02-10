package com.predicate;

import java.util.function.Predicate;

public class ComparingSalary 
{

	public static void main(String[] args) 
	{
		Predicate<Integer> salaryGreaterThanOnelack= x-> x > 10000;
		System.out.println(salaryGreaterThanOnelack.test(500));
		
		Predicate<String> letterStartingWithA = name-> name.toLowerCase().charAt(0)=='a';
		System.out.println(letterStartingWithA.test("Ahmed"));//true
		
		Predicate<String> letterEndingWithN = last ->last.toLowerCase().charAt(last.length()-1)=='n';
		System.out.println(letterEndingWithN.test("khan"));//true
		
		Predicate<String> and = letterStartingWithA.and(letterEndingWithN);
		System.out.println(and.test("AhmedKhan"));// true   ...here,and() method is used.

		Predicate<String> or = letterStartingWithA.or(letterEndingWithN);
		System.out.println(or.test("JammyKhan"));// true    ...here,or() method is used.
		
		System.out.println(letterStartingWithA.negate().test("Ahmed"));// false   ...here,negate() method is used.
		
	}
	

}
