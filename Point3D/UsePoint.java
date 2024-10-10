package Point3D;

public class UsePoint {
	
	public static void main(String[] args)	{
		
		Point3D p1 = new Point3D(10.0, 20.0, 30.0);
		Point3D p2 = new Point3D(p1.getX()*2, p1.getY()*2, p1.getZ()*2);
		
		int mod2p1 = (int) (p1.getX() * p1.getX() + p1.getY() * p1.getY() + p1.getZ() * p1.getZ());
		int mod2p2 = (int) (p2.getX() * p2.getX() + p2.getY() * p2.getY() + p2.getZ() * p2.getZ());
		
		System.out.println("Value of mod2p1 = "+mod2p1);
		System.out.println("Value of mod2p2 = "+mod2p2);
	}
	
}
