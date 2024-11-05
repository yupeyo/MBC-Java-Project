package quiz;

public class BankAccount {

	public static void main(String[] args) {
		
		Account myAcc = new Account("홍길동", 1234, 3600);
		myAcc.deposit(800);
		myAcc.withDraw(1900);
		
		int bal = myAcc.getBalance();
		System.out.println(myAcc.name + "님의 계좌 잔액은 : "+ bal + "원 입니다.");

	}

}
class Account {
	// 1. 필드 (멤버변수)
	String name;
	private int password;
	private int balance;
	// 2. 생성자
	public Account(String name, int password, int balance) {
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	// 3. 메서드
	public void deposit(int money) {
		this.balance += money;
	}
	public void withDraw(int money) {
		this.balance -= money;
	}
	public int getBalance() {
		return balance;
	}
}
	
	