package com.lambdaexpression;

@FunctionalInterface   
interface Apple
{
	 String name(); // Abstract method
	 
	// void so();   ->// Here,if we add one more Abstract method then this interface will not be a 
	                  // Functional Interface... Then the Lambda Expression will also not work
	 
	 default void alpha()  // Default method 
	 {
		 System.out.println("AAA");
	
	 }
	 
	 static boolean sigma() // Static method
	 {
		 return true;
	 }
}
public class Lambda3AllInOne 
{

	public void alpha()  // Default method 
	 {
		 System.out.println("AAA");
	
	 }
	
	public static void main(String[] args)
	{
		Apple apple = ()->{System.out.println("Apple");
			return "fruits";};
			
			System.out.println(apple.name());// Calling the Abstract method 
			
	   // apple.alpha();// Calling the Default method by the Interface Reference
	                  // We can call the Default method By Two Ways 1st by Implementation class Object 
	                  // 2nd by Interface Reference
	    
		Lambda3AllInOne l=new Lambda3AllInOne();
		l.alpha(); // Calling the Default method by the Implementation Class Object
	    
	    System.out.println(Apple.sigma());// Calling the Static method
	    
	    
	    
			 
	  
		
	   }
		

	

	
}


