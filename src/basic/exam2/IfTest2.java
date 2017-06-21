package basic.exam2;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요(0~100 정수값) : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if (90 <= score && score <= 100) {
			System.out.println("A입니다.");
		} else if (80 <= score && score <= 89) {
			System.out.println("B입니다.");
		} else if (70 <= score && score <= 79) {
			System.out.println("C입니다.");
		} else if (60 <= score && score <= 69) {
			System.out.println("D입니다.");
		} else if (0 <= score && score <= 59) {
			System.out.println("F입니다.");
		} else {
			System.out.println("점수를 다시 입력하세요.");
		}

		if (90 <= score) {
			System.out.println("A입니다.");
		} else if (80 <= score) {
			System.out.println("B입니다.");
		} else if (70 <= score) {
			System.out.println("C입니다.");
		} else if (60 <= score) {
			System.out.println("D입니다.");
		} else if (0 <= score) {
			System.out.println("F입니다.");
		} else {
			System.out.println("점수를 다시 입력하세요.");
		}

	/*	int score2 = (int) (Math.random() * 100);

		System.out.println(score2);

		if (90 <= score2 & score2 <= 100) {
			System.out.println("A입니다.");
		} else if (80 <= score2 & score2 <= 89) {
			System.out.println("B입니다.");
		} else if (70 <= score2 & score2 <= 79) {
			System.out.println("C입니다.");
		} else if (60 <= score2 & score2 <= 69) {
			System.out.println("D입니다.");
		} else if (0 <= score2 & score2 <= 59) {
			System.out.println("F입니다.");
		} else {
			System.out.println("점수를 다시 입력하세요.");
		}*/

		int score3 = score/10;
		
		switch(score3){
		case 10 : 
		case 9 :
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		case 6:
			System.out.println("D"); break;
		default :
			System.out.println("F"); break;
		}
		
		sc.close();
	}
}
