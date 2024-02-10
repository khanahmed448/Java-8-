package com.comparator;

import java.util.Set;
import java.util.TreeSet;

public class LambdaInSet2 {

	public static void main(String[] args) 
	{
		Set<Integer> s=new TreeSet<>((a,b)-> b-a);
		s.add(50);
		s.add(43);
		s.add(41);
		s.add(48);
		
		System.out.println(s);

	}

}
