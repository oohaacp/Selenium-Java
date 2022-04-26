package com.ibm.oops;

public class Constructor 
{
	int x;
	public Constructor()
	{
		this.x=122;
		System.out.println("oohaa");
		
	}
	
	public Constructor(String name)
	{
		System.out.println("print string1 :"+ name);
	}
	public Constructor(String name, int age)
	{
		System.out.println("print the 2 constrictors:"+ name);
		System.out.println("age:"+ age);
	}

	public static void main(String[] args) 
	{
		Constructor obj1=new Constructor();
		obj1.oohaa();
		
		Constructor obj2=new Constructor("mani");
		obj1.oohaa(); 
		Constructor obj3=new Constructor("oohaa", 20);

	}
	public void oohaa()
	{
		System.out.println("hiiii");
	}

}
