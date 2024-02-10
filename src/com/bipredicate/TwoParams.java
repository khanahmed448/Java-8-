package com.bipredicate;

import java.util.function.BiPredicate;

public class TwoParams 
{
     public static void main(String[] args)
     {
		  BiPredicate<Integer,Integer> biPredicate=(x,y)-> x%2==0 && y==10;
		  System.out.println(biPredicate.test(20,10));
	 }
}
