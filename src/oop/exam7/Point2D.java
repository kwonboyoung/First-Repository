package oop.exam7;

public class Point2D {

	int x;
	int y;
	
	public Point2D() { 
		this(1,1);	
		System.out.println("Point2D()");
	}
	
	public Point2D(int x, int y) {
		// TODO Auto-generated constructor stub
		super(); // super class의 생성자를 수행하고 돌아오는 역할.
		this.x=x;
		this.y=y;		
		System.out.println("Point2D(x,y)");
	}
	
	
	
}
