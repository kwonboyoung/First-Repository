package basic.exam2;

public class ForTest4 {
	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 5; i++) { for (int j = 1; j <= 5; j++) { if (i
		 * <= j) System.out.print("*"); else System.out.print(" "); }
		 * System.out.println(); }
		 */

		/*
		 * for (int i = 1; i <= 9; i++) { for (int j = 1; j <= 9; j++) {
		 * System.out.println(i + " * " + j + " = " + (i * j)); }
		 * System.out.println(); }
		 */

		// if문 사용해서 for문 2개로 하기
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.println();
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		
		//완성본
		for (int k = 0; k < 2; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 2 + (4 * k); j <= 5 + (4 * k); j++) {
					System.out.print(j + " * " + i + " = " + (i * j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

	}
}
