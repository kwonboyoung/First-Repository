package basic.exam;

import java.util.Scanner;

public class Arithmatic2Test {
	public static void main(String[] args) {
		int i;
		int j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("i = ");
		i=sc.nextInt();
		System.out.print("j = ");
		j=sc.nextInt();
		
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j); // =는 무조건 오른쪽에 사용
		System.out.println(i <= j);
		System.out.println(i == j);
		System.out.println(i != j);
		
		sc.close();
		
	}
}
