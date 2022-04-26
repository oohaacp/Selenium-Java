package com.ibm.oops;

public class Parameters 
{
	public static void main(String[] args) 
	{
		Parameters p=new Parameters();
		p.whileLoop(11, 20);
	}
	public void whileLoop(int start, int end)
	{
		int j=start;
		while(j<=end)
		{
			System.out.println(j);
			j++;
		}
	}
}
