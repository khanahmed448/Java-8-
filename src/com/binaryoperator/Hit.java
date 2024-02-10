package com.binaryoperator;

import java.util.function.BinaryOperator;

public class Hit {

	public static void main(String[] args) 
	{
		BinaryOperator<String> binaryOperator=(str1,str2)-> str1.concat(str2);
		System.out.println(binaryOperator.apply("Mohammad",null));
	}

}
