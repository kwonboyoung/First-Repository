package basic.exam2;

public class ForTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println((i*10)+":"+"김지혁");
		}
		System.out.println("종료");
		
		//1부터 3까지 정수의 합
		int sum=0;
		for(int i=1; i<=3; i++){
			sum+=i;
		}
		System.out.println(sum);
		
		int sum2 =0;
		for(int i=1; i<=1000;i++){
			if(i%3==0){
				sum2 +=i;
			}
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for(int i=3; i<=1000;i+=3){
			sum3 += i;
		}
		System.out.println(sum3);
	}
}
