package oop.exam1;

public class Point2D {
	private int x = 0;
	private int y = 10;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void print(){
		System.out.println("x = " + getX());
		System.out.println("y = " + getY());
	}
}
