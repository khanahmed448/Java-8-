package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Cons1 {

	public static void main(String[] args)
	{
		Consumer<String> con = s -> System.out.println(s);
		con.accept("Arman");

		
		Consumer<List<Integer>> con1 = li -> System.out.println(li);
			
//			for (Integer i:li)
//			{
//				System.out.println(i);
//			}
//		};
		con1.accept(Arrays.asList(1,2,3,4,5,6,7)); 
		
		
		
	}

}
