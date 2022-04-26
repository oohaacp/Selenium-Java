package com.ibm.collectionframework;

public class RealtimeCoinsExample 
{
	public static void main(String[] args) 
	{
		
	
//suppose we have a 524 coins after using 300 it will decrease in ui we need see decre aftr using

	String before = "supercoins 534";
	String after = "supercoins 226";
	
	before = before.substring(11);
	after=after.substring(11);
	System.out.println(before);
	System.out.println(after);
	int beforepoints=Integer.parseInt(before);
	int afterpoints=Integer.parseInt(after);
	
	if(beforepoints>afterpoints)
	{
		System.out.println("coins are decreased");
	}
	else
	{
		System.out.println("coins are not decresed");
	}                                                                                                  
}
}
