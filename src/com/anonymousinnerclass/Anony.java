package com.anonymousinnerclass;

interface Laptop
{
	 int hp();
	 
	 String dell();
}
public class Anony 
{

	public static void main(String[] args)
	{
        
		Laptop l=new Laptop() {
			
			@Override
			public int hp() {
				
				return 50000;
			}
			
			@Override
			public String dell() {
				
				return "Dell";
			}
		};
		
		System.out.println(l.hp());
		System.out.println(l.dell());
 
	}

}
