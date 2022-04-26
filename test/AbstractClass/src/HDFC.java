
public class HDFC extends Bank
{
	public  void loan()
	{
		System.out.println("loan the user");
	}
	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.credit();
		h.debit();
		h.loan();
	}

}
