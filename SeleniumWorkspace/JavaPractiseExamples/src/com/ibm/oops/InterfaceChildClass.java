package com.ibm.oops;

public class InterfaceChildClass implements Interface1,Interface2{

	public static void main(String[] args) {
		InterfaceChildClass icc=new InterfaceChildClass();
		icc.demo();
		icc.demo1();
		icc.dumbo();
		System.out.println(icc.companyname);
		System.out.println(Interface2.companyname2);

	}

	@Override
	public void demo() {
		System.out.println("hey dumbo1");
		
	}

	@Override
	public void demo1() {
		System.out.println("hey dumbo1");
		
	}

	@Override
	public void demo3() {
	System.out.println("hey im dumbo3");
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int dumbo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dumbo1() {
		// TODO Auto-generated method stub
		
	}
	
}


