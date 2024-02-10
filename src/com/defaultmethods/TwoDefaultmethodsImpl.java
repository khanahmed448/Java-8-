package com.defaultmethods;

interface Hi
{
	 default void run() 
	 {
		 System.out.println("Hii");
		 
	 }
}
interface By
{
	 default void run() 
	 {
		 System.out.println("Byy");
	 }
}

public class TwoDefaultmethodsImpl implements Hi,By
{
    public static void main(String[] args)
    {
    	TwoDefaultmethodsImpl t = new TwoDefaultmethodsImpl();
    	t.run();
	}

	@Override
	public void run() 
	{
	    Hi.super.run();
	    By.super.run();
	}

	
}
