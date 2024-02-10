package com.defaultmethods;

interface Ahmed
{
	 
	private void name() 
	{
		System.out.println("Private method");
	}
	 
	 default String showAll()
	 {
		 System.out.println("DONE");
		 name();
		 return "Successfull";
		 
		 
	 }
}
public class MakingPrivateMethodInInterface implements Ahmed
{
    public static void main(String[] args)
    {
    	MakingPrivateMethodInInterface m = new MakingPrivateMethodInInterface();
    	System.out.println(m.showAll());
    	
	}
}
