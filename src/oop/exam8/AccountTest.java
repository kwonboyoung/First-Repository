package oop.exam8;

public class AccountTest {
	public static void main(String[] args) {
		System.out.println(Account.money1);
		
		Account a1 = new Account(1000);
		System.out.print("a1.money1 : "+a1.money1+"\t");
		System.out.println("a1.money2 : "+a1.money2);
		
		Account a2 = new Account(1000);
		System.out.print("a2.money1 : "+a2.money1+"\t");
		System.out.println("a2.money2 : "+a2.money2);
		
		System.out.println(Account.money1);
	}
}
