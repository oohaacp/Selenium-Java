package com.ibm.oops;

public class OverrideChild extends OverrideParent{

	public static void main(String[] args) {
		
OverrideChild oc=new OverrideChild();
oc.displayString("hai");
oc.cut();
oc.zebra(12,13);
System.out.println("the int 2 arguments are:"+oc.add(12, 13));
oc.parameters("hai", 23, true);
	}
	public void cut()
	{
		System.out.println("the cut will happend");
	}
	public String display()
	{
		String name1="haiiiii";
	
	return name1;

}
	
	private void parameters(String name, int id, boolean married)
	{
		System.out.println("name is:"+ name);
		System.out.println("id is:"+ id);
		System.out.println("married is:"+married);
	}
	public static int add(int b, int c)
	{
		return b+c;
	}
}
