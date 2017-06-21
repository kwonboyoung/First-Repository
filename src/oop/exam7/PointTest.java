package oop.exam7;

public class PointTest {
	public static void main(String[] args) {
		
		// 파라미터를 추가한 생성자를 만들었다면, 기본 생성자가 default로 생성되지 않아 오류 남.
		/*Point2D pt1 = new Point2D(); 
		System.out.println("x = "+pt1.x);
		System.out.println("y = "+pt1.y);// x = 0, y = 0
		
		Point2D pt2 = new Point2D(100, 200);
	
		System.out.println("x = "+pt2.x);
		System.out.println("y = "+pt2.y); // x = 100, y = 200
*/
		Point3D pt3 = new Point3D();
		System.out.println("x = "+pt3.x);
		System.out.println("y = "+pt3.y);
		System.out.println("z = "+pt3.z);
		
		Point3D pt4 = new Point3D();
		System.out.println("x = "+pt4.x);
		System.out.println("y = "+pt4.y);
		System.out.println("z = "+pt4.z);
	}
}
