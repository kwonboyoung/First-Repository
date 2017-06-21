package oop.exam3;

public class Human {
	private String name;
	private int gender; // 주민번호 7번째 자리
	private int year; // 태어난 년도
	private String job; // 직장
	private boolean married; // 미혼 - true, 기혼 - false
	private String hobby;
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	@Override
	public String toString() {
		return  name + "회원님은 " + whatGender() + "이며\n출생년도는" + year + "년이며, 직업은 " + job + "이고\n" + whatMarried()
				+ "이고, 취미는 " + hobby + "입니다.";
	}
	private String whatMarried() {
		
		return married == true? "미혼" : married == false ? "기혼": "에러";
//		return married? "미혼":"기혼";
		
	}
	private String whatGender() {
		
		return gender == 1 || gender == 3 ? "남성" : gender == 2 || gender == 4? "여성": "에러";
	}
	
	
	
}
