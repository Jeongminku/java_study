package test.ch10.makeException;

public class AccountEX {

	public static void main(String[] args) {
		Account account = new Account(); // 계좌생성.
		
		//저축
		account.deposit(10000); //10,000 예금
		
		System.out.println("예금액: "+ account.getBalance());
		
		try {
			account.withdraw(30000); //30,000 출금
		} catch (InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		} 
	}

}
