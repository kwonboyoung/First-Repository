package oop.exam7;

public class Point3D extends Point2D{
	int z;
	
	public Point3D(){
		this(100,200,300);
		System.out.println("Point3D()");
	}

	public Point3D(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		super(i,j);
		this.z = k;
		System.out.println("Point3D(i,j,k)");
		
	}
	
	
}

