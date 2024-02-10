package com.predicate;

import java.util.function.Predicate;

public class CharacterComparison {

	public static void main(String[] args)
	{
		Predicate<Character> CharacterComparison = x-> 'a'==x;
		System.out.println(CharacterComparison.test('z'));

	}

}
