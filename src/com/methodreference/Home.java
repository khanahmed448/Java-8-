package com.methodreference;

import java.util.Arrays;
import java.util.List;

public class Home 
{
	  public  void hello(String s)
	  {
		  System.out.println(s);
		 // System.out.println("hello");
	  }

	public static void main(String[] args) 
	{
        // hello("abrar");
		
		Home home=new Home();
		
		List<String> students=Arrays.asList("Ahmed","Abrar","Asif","Jamshed","Moin");
		
		//students.forEach(x->hello(x));
		//students.forEach(Home::hello);  --> When the method is static
		
		students.forEach(home::hello);  // --->When the method is not static
		
		
		

	}

}
