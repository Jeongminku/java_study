package test.ch10.makeException;

public class Account {
	//필드   
	private long balance;  //balance = 잔고
	
	//생성자
	public Account() { }
	
	//메소드
	public long getBalance() {
		return balance;
	}
	
	//예금하는 메소드
	public void deposit(int money) { //저축하려는 money
		this.balance += money; // 예금 money값만큼 balance(잔고)에 누적합산.
	}
	
	//출금하는 메소드
	public void withdraw(int money) throws InsufficientException { //출금하려는 money
		//잔고보다 내가 출금하려는 돈이 더 크다면 예외를 발생시킨다.
		if (money > this.balance) {
			throw new InsufficientException("잔고 부족: " + (money - balance) + "원이 부족합니다.");
		}
		
		this.balance -= money; //잔고에서 출금하려는 돈을 빼줌.
	}
	
	
	
}
