package com.lambdaexpression;

interface Yes
{
	int run(int a); // abstract method
}
public class lambda2
{

	public static void main(String[] args)
	{
		Yes yes = (int a)->{System.out.println("Arman");
		return 1;
			};
		System.out.println(yes.run(10));

	}

}
