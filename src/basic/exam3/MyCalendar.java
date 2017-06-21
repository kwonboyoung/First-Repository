package basic.exam3;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);

		System.out.print("년도? ");
		int req_year = sc.nextInt();

		System.out.println("월? ");
		int req_month = sc.nextInt();

		c.set(req_year, req_month - 1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK);
		int end_day = c.getActualMaximum(Calendar.DATE);

		System.out.println(req_year + "년 " + req_month + "월");
		System.out.println("---------------------");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("---------------------");

		for (int d = 1; d < week; d++) {
			System.out.print("   "); // 한글 한 글자에 숫자 2개
		}

		for (int d = 1, w = week; d <= end_day; d++, w++) {
			System.out.print(d < 10 ? " " + d + " " : d + " ");
			if (w % 7 == 0)
				System.out.println();
		}
	}
}
