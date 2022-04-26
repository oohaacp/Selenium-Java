package com.ibm.collectionframework;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(null);
		al.add("string");
		al.add(true);
		al.add(12.3);
		al.add(12345);
		al.add(null);
		al.remove(2);
		System.out.println(al);
		al.add(null);
		System.out.println(al.get(3));
		System.out.println(al.contains(5));
		System.out.println("list size are:"+al.size());
		
		for (Object val : al) 
		{
			System.out.println(val);
		}
		 

	}

}
