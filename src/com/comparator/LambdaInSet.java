package com.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LambdaInSet implements Comparator<Integer>{

	public static void main(String[] args)
	{
		Set<Integer> s= new TreeSet<>();
		s.add(25);
		s.add(13);
		s.add(16);
		s.add(36);
		
		System.out.println(s);
		
		Set<Integer> ss= new TreeSet<>(new LambdaInSet());
		ss.add(10);
		ss.add(3);
		ss.add(8);
		ss.add(5);
		
		System.out.println(ss);

	}

	
	public int compare(Integer a,  Integer b) {
		
		return b-a;
	}




}
