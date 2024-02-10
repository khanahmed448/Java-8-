package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingLambdaForComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer a, Integer b) {
		
		return b-a;
	}
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(50);
		list.add(80);
		list.add(20);
		list.add(70);
		list.add(50);
		list.add(12);
		
		//Collections.sort(list,(a,b)-> b-a);// Using the Lambda expression for Comparator for printing the Descending order of 
		                                   // the Elements 
		
		Collections.sort(list,new UsingLambdaForComparator()); 
		System.out.println(list);

	}

	

}
