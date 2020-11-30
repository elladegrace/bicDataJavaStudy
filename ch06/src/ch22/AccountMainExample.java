package ch22;

public class AccountMainExample {
	static int seq=0;
	public static void main(String[] args) {
		Account account=new Account("001-20001-01", "홍길동", 1000);
		System.out.println(account.getOwner()+","+account.getAccountNo()+","+account.getBalance());
		
		//입금
		account.deposit(5000);
		System.out.println(account.getOwner()+","+account.getAccountNo()+","+account.getBalance());
		
		//출금
		account.withdraw(9000);
		System.out.println(account.getOwner()+","+account.getAccountNo()+","+account.getBalance());
		account.withdraw(3000);
		System.out.println(account.getOwner()+","+account.getAccountNo()+","+account.getBalance());
		
		
		Account account2=new Account("일지매", 1000);
		System.out.println(account.getOwner()+","+account.getAccountNo()+","+account.getBalance());
		
		
	}

}
