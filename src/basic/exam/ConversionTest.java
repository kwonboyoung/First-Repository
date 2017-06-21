package basic.exam;

public class ConversionTest {
	public static void main(String[] args) {
		/*
		 * double d =10; // 자동 형변환(묵시적 형변환) System.out.println(d);
		 * 
		 * int i=(int)3.14; // 반올림이 아닌 무조건 버림 System.out.println(i);
		 */

		int r = (int)(Math.random() * 12)+4;
		System.out.println(r);
		
		int a = ((int)(Math.random() *17)+6)*100;
		System.out.println(a);
		
	}
}

