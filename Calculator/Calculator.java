package Calculator;

public class Calculator {

	private int		nOpDone;
	private	double 	lastRes;
	
	public double add(double x, double y)	{
		
		double result;
		
		result = x + y;
		nOpDone++;
		lastRes = result;
		
		return(result);
	}
	
	public double sub(double x, double y)	{
		
		double result;
		
		result = x - y;
		nOpDone++;
		lastRes = result;
		
		return(result);
	}
	
	public double mul(double x, double y)	{
		
		double result;
		
		result = x * y;
		nOpDone++;
		lastRes = result;
		
		return(result);
	}
	
	public double div(double x, double y)	{
		
		double result;
		
		result = x / y;
		nOpDone++;
		lastRes = result;
		
		return(result);
	}
	
	public void printData()	{
		
		System.out.println("Number of operations done : "+this.nOpDone);
		System.out.println("Last result : "+this.lastRes);
		
	}
	
}
