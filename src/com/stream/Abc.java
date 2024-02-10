package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Abc {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Ahmed","Arhan","Abrar","Asif");
		Stream<String> stream = list.stream();
		
		String name[]= {"Ahmed","Arhan","Abrar","Asif"};
		Stream<String> stream2 = Arrays.stream(name);
		
		  Stream<Integer> of = Stream.of(1,4,5,8,34,7);

	}

}
