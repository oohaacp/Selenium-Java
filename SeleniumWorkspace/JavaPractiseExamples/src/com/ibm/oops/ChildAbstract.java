package com.ibm.oops;

public class ChildAbstract extends  Abstract {

	public static void main(String[] args) 
	{
	ChildAbstract ca=new ChildAbstract();
	ca.demo();
	ca.super1();
	ca.hello();
	ca.hai();
	

	}

	@Override
	public void demo() {
		System.out.println("hey im abstract");
		
	}

	@Override
	public void super1() {
		System.out.println("hey im super");
		
	}
	
	public String hello()
	{
		System.out.println("hai hello coming");
		return null;
	}
	

}
