package basic.method;

public class MethodTest9 {
	public static void main(String[] args) {
		int[] n={100,200};
		
		swapFunction(n); // call by reference : 참조에 의한 호출
		
		System.out.println(n[0]);
		System.out.println(n[1]);
	}

	private static void swapFunction(int[] n) {
		int temp = n[0];
		n[0] = n[1];
		n[1] = temp;		
	}
}
