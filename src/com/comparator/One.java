package com.comparator;

public class One 
{
     public int show(Object obj)
     {
    	 return 0;
     }
     public int show(String str)
     {
    	 return 1;
     }
     
    /* public int show(Integer integere)  // here we will get ambiguity error
     {
    	 return 1;
     }*/
     
     
     public static void main(String[] args)
    {
		One a=new One();
		System.out.println(a.show(null));
	}
}

/*In the main method, an instance of the One class is created (One a = new One();),
  and then the show method is called with a null argument (a.show(null);).
  Since null is compatible with both Object and String, the Java compiler selects the most specific method 
  that matches the argument.
  In this case, the show(String str) method is more specific than the show(Object obj) method, so it is chosen.
  Therefore, the output of System.out.println(a.show(null)); is 1.
  The key point here is that when there are multiple overloaded methods with different parameter types, the compiler selects the most specific method that matches the argument provided. In this example, the method with the String parameter is more specific when null is passed, so it is called, and the result is 1.*/








