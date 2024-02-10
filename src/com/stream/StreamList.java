package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList 
{

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,3,5,2,6,7,88,9,44,55,28,2,4,6);
		List<Integer>  filteredList = list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b)->b-a).limit(5).skip(2).collect(Collectors.toList());
		
		System.out.println(filteredList);
		
		
		
		
		Optional<Integer> peek = list.stream().map(x -> x+x).limit(10).peek(x -> System.out.println(x)).max((x,y) -> x-y);
		System.out.println(peek.get());
		

	}

}
