package com.ibm.oops;

 class Atm
{
	private int customerid;
	
	private String customername;
	
	
	public void setcustomerid(int customerid)
	{
		this.customerid=customerid;
	}
	
	public int getcustomeid()
	{
		return customerid;
	}
	
	public void setcustomerName(String customername)
	{
		this.customername=customername;
	}
	
	public String getcustomerName()
	{
		return customername;
	}
	
	
	
	
}

public class Encapsulation 
{


	public static void main(String[] args) 
	{
		Atm a=new Atm();
		a.setcustomerid(10);
		a.setcustomerName("oohaa");
		System.out.println("the customerid of the value is:"+a.getcustomeid());
		System.out.println("the customer name is="+a.getcustomerName());
		
	}
	
	
}
