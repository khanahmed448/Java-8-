package com.comparator;

interface A
{
	default void show()
	{
		System.out.println("Moin");
	}
}
interface B
{
	default void show()
	{
		System.out.println("Arhan");
	}
}
public class NoWay implements A,B
{

	public static void main(String[] args) 
	{
		B n= new NoWay();
		n.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		B.super.show();
	}

	

}
