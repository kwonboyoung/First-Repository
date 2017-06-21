package oop.exam4;

public class AnimalTest {
	public static void main(String[] args) {
		/*Animal animal = new Animal();
		System.out.println(animal);*/
		
		//sub 타입 인스턴스는 super type으로 참조 가능
		Animal animal = new Eagle(); //자동형변환(묵시적 형변환)
		System.out.println(animal);
		
//		Bird bird = new Animal(); -> 에러
		
		Bird bird2 = (Bird) animal; //RuntimeException ; 실행 시 에러가 남.
//		System.out.println(bird2); 

		//down casting은 원 인스턴스의 타입이 캐스팅하려는 타입이거나 캐스팅 타입의 서브타입이어야 함.
		Animal condor = new Condor();
		System.out.println(condor);
		Bird condor2 = (Bird) condor;
		System.out.println(condor2);
		
		
		Animal eagle = new Eagle();
		Bird bird3 = (Bird) eagle;
		System.out.println(bird3);
		Eagle eagle2 = (Eagle) eagle;	
		System.out.println(eagle2);
		Condor condor3 = (Condor) eagle;
		System.out.println(condor3);

//		Animal eagle3 = new Eagle();
		
		/*Tiger tiger = (Tiger) eagle3;
		System.out.println(tiger);*/
		
	}
}
