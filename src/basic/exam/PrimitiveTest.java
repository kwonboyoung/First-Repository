package basic.exam;

public class PrimitiveTest {
	public static void main(String[] args) {
		// boolean : true or false를 나타내는 1비트(1바이트 할당)
		boolean b = true;
		System.out.println("b = "+b);
		
		// byte : -128~127 1byte
		byte b2 = 127;
		System.out.println("b2 = "+b2);
		
		// int : -2147483648 ~ 2147483647 
		int i = 2147483647;
		System.out.println("i = "+i);
		
		// short : -32768 ~ 32767
		short s = 32767;
		System.out.println("s = "+s);
		
		// long : 900경
		long l1 = 2147483648L; // int의 범위를 넘어가는 수임을 알려야 한다.(L)
		System.out.println("l1 = "+l1);
		
//		 char : 2byte(유니코드)
		char c = '가';
		System.out.println("c = "+c);
		
		// double : 실수형 
		double d = 3.1415926535;
		System.out.println("d = "+d);
		
		float f = 3.1415926535f; // double의 범위를 넘어가는 수임을 알려야 한다.(f)
		System.out.println("f = "+f);
		
		// escape sequence
		System.out.println("가\t나\t다");
		System.out.println("가	나	다");
		System.out.println("가    나    다");
		
		System.out.println("안녕하세요\n딸기밭이여 영원하라");
		System.out.println("하이\\하이");
		System.out.println("\"야호~~~\"");
		
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		
		
	}
}
