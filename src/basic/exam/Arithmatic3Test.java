package basic.exam;

public class Arithmatic3Test {
	public static void main(String[] args) {
		boolean t1, t2;
		t1 = true; t2 = true; System.out.println(t1&&t2);
		t1 = true; t2 = false; System.out.println(t1&&t2);
		t1 = false; t2 = false; System.out.println(t1&&t2);

		t1 = true; t2 = true; System.out.println(t1||t2);
		t1 = true; t2 = false; System.out.println(t1||t2);
		t1 = false; t2 = false; System.out.println(t1||t2);
		
		System.out.println(!true);
		System.out.println(!t1);
		System.out.println(!t2);
		System.out.println(t2);
	
	
	}
}
