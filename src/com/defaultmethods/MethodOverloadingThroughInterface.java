package com.defaultmethods;


interface Load
{
	   void show(int a);
	 
	  
	  default void show(String name)
	  {
		  System.out.println("byy");
	  }
}
public class MethodOverloadingThroughInterface implements Load
{

	public static void main(String[] args) 
	{
		MethodOverloadingThroughInterface m=new MethodOverloadingThroughInterface();
		m.show(10);
				

	}

	@Override   // Abstract method
	public void show(int a) {
		System.out.println("Arhan");
		
	}
	
	// Default method
	public void show(String name)
	  {
		  System.out.println("Moin");
	  }

}
