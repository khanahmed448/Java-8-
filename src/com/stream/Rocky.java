package com.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Rocky {

	public static void main(String[] args) 
	{
		/* Imperative Programming
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				//sum+=i;
				sum=sum+array[i];
			}
		}
		System.out.println(sum);*/
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		 Arrays.stream(arr).filter(x->x%2==0);

	}

}
