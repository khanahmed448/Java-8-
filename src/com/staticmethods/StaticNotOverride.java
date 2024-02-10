package com.staticmethods;

interface Ahmed
{
	  static void sayHello()
	 {
		 System.out.println("Hello World");
	 }
	 
	 default void show()
	 {
		 System.out.println("Hello Sea");
	 }
}
public class StaticNotOverride implements Ahmed
{
     public static void main(String[] args)
     {
    	// StaticNotOverride s=new StaticNotOverride();
    	 Ahmed a=new StaticNotOverride();
    	 a.show();
    	 
    	// Here, using the reference of the interface static method is called......
		Ahmed.sayHello();
	 }
}
