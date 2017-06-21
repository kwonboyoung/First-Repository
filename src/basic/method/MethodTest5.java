package basic.method;

import java.util.Scanner;

public class MethodTest5 {
	public static void main(String[] args) {

		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요>>");
		Scanner sc = new Scanner(System.in);

		int me = sc.nextInt();
		System.out.println("you : "+caption(me));

		int com = (int) (Math.random() * 3) + 1;
		System.out.println("com : "+caption(com));

		int result = (me - com+3)%3;

		switch (result) {
		case 1:
			System.out.println("당신의 승리");
			break;
		case 2:
			System.out.println("컴퓨터의 승리");
			break;
		default:
			System.out.println("무승부");
			break;
		}
		sc.close();
	}

/*	private static void caption(int value) {
		switch (value) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("에러");
			break;caption(com)
		}

	}*/
	
	private static String caption(int value) {		
		switch (value) {
		case 1:
			return "가위";
		case 2:
			return "바위";
		default:
			return "보";
		}

	}
}
