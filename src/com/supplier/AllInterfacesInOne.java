package com.supplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllInterfacesInOne 
{
        public static void main(String[] args) 
        {
		    Predicate<Integer> predicate = x -> x%2==0;
			//System.out.println( predicate.test(100));
			
			Function<Integer, Integer> function = a -> a*a*a;
			//System.out.println(function.apply(4));
			
			Consumer<Integer> consumer= z -> System.out.println(z);
			//consumer.accept(10);
			
			Supplier<Integer> supplier = ()-> 100;
			//System.out.println(supplier.get());
			
			
			if(predicate.test(supplier.get()))
			{
				consumer.accept(function.apply(supplier.get()));
			}
		}
}
