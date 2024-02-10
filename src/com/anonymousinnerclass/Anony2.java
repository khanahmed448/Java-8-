package com.anonymousinnerclass;


interface Education
{
	void Science();
	
	void Commerce();
	
	/*default String arts()
	{
		return "Architect";
	}*/
}
public class Anony2 
{
     
	public static void main(String[] args) 
	{
		Education e= new Education() {
			
			@Override
			public void Science() {
				System.out.println("Chemistry");
				
			}
			
			@Override
			public void Commerce() {
				System.out.println("finance");
				
			}
		};
		
		e.Science();
		e.Commerce();
			
			
		

	}

}
