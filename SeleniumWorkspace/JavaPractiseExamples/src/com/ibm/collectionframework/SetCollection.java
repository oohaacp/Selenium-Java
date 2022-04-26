package com.ibm.collectionframework;

import java.util.HashSet;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) 
	{
		/* HashSet hs=new HashSet(); */
		TreeSet hs=new TreeSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		/* hs.add(null); */
		hs.add(30);
		/* hs.add(null); */
		System.out.println(hs);
		//class cast exception will come on Generics because we can give either string or int

	}

}
