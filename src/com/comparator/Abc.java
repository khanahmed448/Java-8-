package com.comparator;

public class Abc 
{
	
    public int sum(int a,int b)
    {
    	return a+b;
    }
    public int sum(int a,int b,int c)
    {
    	return a+b+c;
    }
    public int sum(int...a)
    {
    	int x=0;
    	for (int i : a) 
    	{
		   x+=i;
		}
    	return x;
    }
	public static void main(String[] args) 
	{
		Abc a=new Abc();
		System.out.println(a.sum(5,5,5,5));

	}

}
