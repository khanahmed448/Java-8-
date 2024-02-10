package com.lambdaexpression;

// This is Functional Interface
interface Lamb
{
	void sayHello();
}
public class Lambda1 
{
    public static void main(String[] args)
    {
		Lamb lamb = ()-> System.out.println("Ahmed");
		lamb.sayHello();  
		
	}
}
