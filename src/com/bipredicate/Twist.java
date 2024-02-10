package com.bipredicate;

import java.util.function.BiPredicate;

public class Twist {

	public static void main(String[] args)
	{
		BiPredicate<Integer,Character> biPredicate=(x,y)->x==10 & y==97;
		System.out.println(biPredicate.test(10,'b'));

	}

}
