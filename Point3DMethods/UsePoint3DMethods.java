package Point3DMethods;

public class UsePoint3DMethods {
	
	public static void main(String[] args)	{
		
		Point3DMethods p1 = new Point3DMethods(10.0, 20.0, 30.0);
		Point3DMethods p2 = new Point3DMethods(10.0, 20.0, 31.0);
		System.out.println("Square module of p1: " + p1.getSquareModule());
		System.out.println("Square module of p2: " + p2.getSquareModule());
		System.out.println("p1 is equal to p2? : " + p1.equal(p2));
		}
}
