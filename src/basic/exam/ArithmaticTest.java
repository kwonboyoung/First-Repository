package basic.exam;

import java.util.Scanner;

public class ArithmaticTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("a : ");
		a=sc.nextInt();
		System.out.print("b : ");
		b=sc.nextInt();
		
		System.out.println(a +"+"+ b +"="+(a+b));
		System.out.println(a +"-"+ b +"="+(a-b));
		System.out.println(a +"*"+ b +"="+(a*b));
		System.out.println(a +"/"+ b +"="+((double)a/b));	// 정수/정수 = 정수, 어느 한 쪽의 필드가 정교하면 그 필드를 따라감.
		System.out.println(a +"%"+ b +"="+(a%b));
		
		sc.close();
		
	}
}
