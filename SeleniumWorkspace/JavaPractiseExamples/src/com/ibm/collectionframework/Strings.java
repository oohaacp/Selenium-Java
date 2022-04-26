package com.ibm.collectionframework;

public class Strings {

	public static void main(String[] args) {
		String s1="hai";
		String s2="hai1";
		
		
		String s3=new String("buddy");
		String s4=new String("buddy");
		
		
		System.out.println(s3=s4);
		String s5=s4.concat(s2);
		
		System.out.println(s5);
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s3==s4);
		
		System.out.println(s3.equals(s4));
		
		
		

	
	if(s1.equals(s2)) 
	{
		System.out.println("both s1&s2 strins are same");
	}
	else
	{
		System.out.println("both s1&s2 not same");
	}
	if(s3.equals(s4)) 
	{
		System.out.println("both s3 &s4 strins are same");
	}
	else
	{
		System.out.println("both s3& s4 not same");
	}
	if(s1==s2) 
	{
		System.out.println("both s1&s2 strins are same");
	}
	else
	{
		System.out.println("both s1& s2not same");
	}
	if(s3==s4) //==whether 2 objects pointing to the same object or not
	{
		System.out.println("both s3& s4 strins are same");
	}
	else
	{
		System.out.println("both s3 &s4 not same");
	}
		
	}

}
