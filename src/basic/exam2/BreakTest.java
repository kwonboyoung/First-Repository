package basic.exam2;

public class BreakTest {
	public static void main(String[] args) {
		int sum=0;
		int i = 1;
		while(true){
			sum += i;
			if(sum >= 30) break;
			i++;
		}
		System.out.println("1부터 "+i+"까지의 정수의 합계는 "+sum);
	}
}
