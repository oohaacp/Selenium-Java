package com.ibm.oops;

public class AbstractChildImpl extends AbstarctClass
{

	public static void main(String[] args) 
	{
		AbstractChildImpl abc=new AbstractChildImpl();
		
		abc.pull();
		abc.push();
		abc.sample();
}
	public void pull()
	{
		System.out.println("helooooo------!!!!!");
	}
	@Override
	public void push() {
		System.out.println("fineeeee...!!!!");
		
	}
	@Override
	public void mob() {
		System.out.println("moblllllll");
		
	}

}
