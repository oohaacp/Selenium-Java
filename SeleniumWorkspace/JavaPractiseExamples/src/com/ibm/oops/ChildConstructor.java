package com.ibm.oops;

public class ChildConstructor extends Constructor1
{
	public ChildConstructor()
	{
		super("oohaa");
		
		System.out.println("hey iam child constructor ");
	}

	public static void main(String[] args) 
	{
		ChildConstructor cc=new ChildConstructor();
		
		cc.demo();
		
		
		

	}

}
