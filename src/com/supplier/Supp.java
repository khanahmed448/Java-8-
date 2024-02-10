package com.supplier;

import java.util.function.Supplier;

public class Supp {

	public static void main(String[] args)
	{
		Supplier<String> supplier = ()-> "Ahmed";
		System.out.println(supplier.get());       // Supplier is not taking anything but it is giving something

	}

}
