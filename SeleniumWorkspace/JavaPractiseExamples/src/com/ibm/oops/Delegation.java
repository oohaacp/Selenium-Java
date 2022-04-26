package com.ibm.oops;

public class Delegation extends Static{

	public static void main(String[] args)
	{
		Delegation d=new Delegation();
		
         
		d.push();
		Static.pop();
		Static.pulp();

	}
	public void push()
	{
		System.out.println("kjshdjkshd............");
	}

}
