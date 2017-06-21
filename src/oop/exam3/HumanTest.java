package oop.exam3;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		
		h.setName("권보영");
		h.setGender(2);
		h.setYear(1992);
		h.setJob(".");
		h.setMarried(true);
		h.setHobby("listening");
		
		System.out.println(h);
		
		
		AnimalLover al = new AnimalLover();
		al.setName("권보영");
		al.setGender(2);
		al.setYear(1992);
		al.setJob(".");
		al.setMarried(true);
		al.setHobby("listening");
		al.setAnimalType("강아지");
		al.setAyear(2);
		
		System.out.println(al);
	}
}
