package basic.exam4;

public class ArrayTest {
	public static void main(String[] args) {
		
		int n[] = {100,70,90};
		
		/*int[] n = new int[3];
		n[0] = 100;
		n[1] = 90;
		n[2] = 70;
		*/// n[3] = 100;

		/*for (int i = 0; i < 3; i++) {
			System.out.println(n[i]);
		} n[3]의 값이 있었을 경우, 에러*/
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
}
