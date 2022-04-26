package com.ibm.oops;

import java.util.Arrays;

public class Demo
{
	public static void main(String[] args)
	{
		String s1="ooha";
		String s2="ooha";
		
		String s3=new String("ooha");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		System.out.println(s2.equals(s3));
		System.out.println(s1==s3);
		
		
	}
}
