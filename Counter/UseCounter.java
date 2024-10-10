package Counter;

public class UseCounter {
	
	public static void main(String[] args)	{
		
		Counter c = new Counter();
		System.out.println("Value of counter c = "+c.getValue());
		c.inc();
		System.out.println("Value of counter c = "+c.getValue());
		
		Counter c1 = new Counter();
		System.out.println("Value of counter c1 = "+c1.getValue());
		c1.inc();
		System.out.println("Value of counter c1 = "+c1.getValue());
	}
}
