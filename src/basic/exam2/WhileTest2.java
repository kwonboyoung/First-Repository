package basic.exam2;

public class WhileTest2 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println((i * 10) + " : " + "김지혁");
			i++;
		}

		int sum = 0;
		int j = 0;
		while (j <= 1000) {
			sum += j;
			j += 3;
		}

		System.out.println(sum);
	}
}
