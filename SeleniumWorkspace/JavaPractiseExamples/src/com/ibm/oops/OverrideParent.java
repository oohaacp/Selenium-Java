package com.ibm.oops;

public class OverrideParent {

	public static void main(String[] args) {
		OverrideParent op = new OverrideParent();
		op.add(10, 50);
		System.out.println("add values are:" + op.add(12, 13));
		System.out.println("sub values are:" + op.sub("hai ", "darling"));
		op.zebra(10,20,30);
		op.displayString("my", "hai", "lucky");
		op.parameters("ooha", 25, false);

	}

	public String display(String string) {
		String name = "oohaa";

		return name;

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public String sub(String b, String c) {
		return b + c;
	}

	public void zebra(int... a) {
		for (int i : a) {
			System.out.println(i);

		}
	}

	public static void displayString(String...b) {
		for (String val : b) {
			System.out.println(val);
		}
		
	}

	private static void parameters(String name, int id, boolean married) {
		System.out.println("name is:" + name);
		System.out.println("id is:" + id);
		System.out.println("married is:" + married);
	}
}
