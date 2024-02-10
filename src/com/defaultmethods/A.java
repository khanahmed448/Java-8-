package com.defaultmethods;

public interface A
{
      default void show()
      {
    	  System.out.println("Hello");
      }
}

class B implements A
{
	public void show()
    {
  	  System.out.println("Hello World");
    }
}
class SingleDefaultMethods
{
	public static void main(String[] args)
	{
	  B  b=new B();  //  Hello World
	  
	  A a=new B();   //  Hello World
	  b.show();
	   
		
	}
	
}

