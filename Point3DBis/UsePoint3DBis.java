package Point3DBis;

public class UsePoint3DBis {
	
	public static void main(String[] args)	{
		
		Point3DBis p1 = new Point3DBis(10.0, 20.0, 30.0);
		Point3DBis p2 = new Point3DBis(10.0, 20.0, 31.0);
		
		System.out.println("Square module of p1: " + p1.getSquareModule());
		System.out.println("Square module of p2: " + p2.getSquareModule());
	}
}
