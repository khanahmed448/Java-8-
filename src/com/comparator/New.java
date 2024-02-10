package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class New //implements Comparator<Integer>
{
	/*@Override
	public int compare(Integer a, Integer b) 
	{
	     return b-a;
	}*/
	
     public static void main(String[] args)
    {
		List<Integer> li = new ArrayList<>();
		li.add(2);
		li.add(5);
		li.add(10);
		li.add(80);
		li.add(55);
		li.add(23);
		
		//Collections.sort(li); // --> Ascending sorting of the Elements
		
		//Collections.sort(li,new New());  // Descending sorting of the Elements
		
		Collections.sort(li,(a,b)->b-a);  // Using Java 8 Feature of Comparator for Descending sorting
		
		//Collections.sort(li,(a,b)->a-b);  // Using Java 8 Feature of Comparator for Ascending sorting
		
		System.out.println(li);
	}

	
}
