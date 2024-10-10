package Point3DBis;

public class Point3DBis {
	
	private double x, y, z;
	
	public Point3DBis (double x, double y, double z)	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getSquareModule()	{
		 
		return(this.x * this.x + this.y * this.y + this.z * this.z);
	}
}

