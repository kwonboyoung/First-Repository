package basic.exam3;

import java.util.Calendar;

public class CalanderExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		// int month = now.get(Calendar.MONTH); // "월 : 5"출력
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);

		System.out.println("년도 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("몇번째 요일 : " + week); // 일요일이 1

		int amPm = now.getMaximum(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(strAmPm);
		System.out.print(" " + hour + "시");
		System.out.print(" " + minute + "분");
		System.out.println(" " + second + "초");

		now.set(2017, 5, 18);

		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH) + 1;
		day = now.get(Calendar.DATE);
		week = now.get(Calendar.DAY_OF_WEEK);

		System.out.println("년도 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("몇번째 요일 : " + week); // 일요일이 1
		
		now.add(Calendar.DATE, 1);

		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH) + 1;
		day = now.get(Calendar.DATE);
		week = now.get(Calendar.DAY_OF_WEEK);

		System.out.println("년도 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("몇번째 요일 : " + week); // 일요일이 1
		System.out.println("마지막 날 : "+ now.getActualMaximum(Calendar.DATE));
		
	}
}
