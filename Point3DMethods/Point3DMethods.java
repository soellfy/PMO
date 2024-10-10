package Point3DMethods;

public class Point3DMethods {
	
	private double x, y, z;

	
	public Point3DMethods(double a, double b, double c)	{
		
		this.x = a;
		this.y = b;
		this.z = c;
	}
	
	public double getSquareModule()	{
		
		return(this.x *this.x + this.y * this.y + this.z * this.z);
	}
	
	public boolean equal(Point3DMethods q)	{
		
		return(this.x == q.x && this.y == q.y && this.z == q.z);
	}
}
