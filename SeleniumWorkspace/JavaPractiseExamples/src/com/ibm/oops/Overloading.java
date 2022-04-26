package com.ibm.oops;

public class Overloading {

	public static void main(String[] args) 
	{
		Overloading oa=new Overloading();
		oa.add(10);
		oa.add(10, 10);
		oa.add(10, 20, 14);

	}
	public void add(int add)
	{
		System.out.println(add);
	
	}
	public void add(int add, int addd)
	{
	int c=add+addd;
	System.out.println(c);
		
	}
	public void add(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);
		
	}

}
