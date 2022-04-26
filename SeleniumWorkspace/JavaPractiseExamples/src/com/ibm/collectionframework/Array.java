package com.ibm.collectionframework;

public class Array {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40};
		System.out.println(a[1]);
		System.out.println(a[0]);
		
		System.out.println("using for loop");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("using for each loop");
		for (int i : a) 
		{
			System.out.println(i);
		}
	}

}
