package basic.method;

public class MethodTest6 {
	public static void main(String[] args) {
		// int i = 123_456_789;
		print(1);
		print(2, 3); // method overloading
		print(4, 5, 6); // method overloading
		print(4, 5, 6, 234, 587, 899, 46, 27, 36);

		/*
		 * String name = "최지웅"; print(name); System.out.println(name); // 최지웅
		 */

		int a = 10, b = 5;
		swapNumber(a, b);
		System.out.print("a : " + a);
		System.out.println("b : " + b); // a : 10, b : 5 출력
		
		int[] lotto = { 1, 2, 3, 4, 5, 6 };
		swapRandom(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + "\t");
		}
	}
	
	//기본 자료형은 값을 수정시 리턴 후 원래 값으로 돌아 옴.
	private static void swapNumber(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	} 

	// 1번째 숫자와 마지막 숫자를 바꿔 봄. 참조 자료형은 값을 수정시 되돌아가서도 값이 바뀜.
	private static void swapRandom(int[] lotto) {
		int temp = lotto[5];
		lotto[5] = lotto[0];
		lotto[0] = temp;
	}

	private static void print(String name) {
		name = "박병규";
	}

	private static void print(int... i) {
		for (int j : i) {
			System.out.print(j + "\t");
		}
		System.out.println();
	}

	/*
	 * private static void print(int... i) { for (int j=0; j < i.length; j++) {
	 * System.out.println(i[j]+"\t"); } System.out.println(); }
	 */

	/*
	 * private static void print(int i, int j, int k) { System.out.println(i +
	 * "\t" + j + "\t" + k); }
	 * 
	 * private static void print(int i, int j) { System.out.println(i + "\t" +
	 * j); }
	 * 
	 * private static void print(int i) { System.out.println(i);
	 * 
	 * }
	 */

}
