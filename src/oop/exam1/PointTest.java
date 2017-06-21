package oop.exam1;

public class PointTest {
	public static void main(String[] args) {
		
		
		Point3D pt = new Point3D();
		
		/*System.out.println("x = " + pt.x);
		System.out.println("y = " + pt.y); //x = 0, y = 10
*/		
		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);

		pt.print();
		
		/*System.out.println("x = " + pt.getX());
		System.out.println("y = " + pt.getY()); //x = 100, y = 200
		System.out.println("z = " + pt.getZ());*/
	}
}
