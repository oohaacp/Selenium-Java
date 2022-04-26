
public class Overload 
{
	int add(int a, int b)
		{
		return a+b;
			
		}
	int add(int a, int b, int c)
	{
		
		return a+b+c;
	}
//String add(String a, String b)
//{
//	return a+b;
//}
public static void main(String[] args) {
	Overload ov=new Overload();
	ov.add(10, 20);
	ov.add(10, 20,30);
//	ov.add("oohaa", "reddy");
			
}
}
