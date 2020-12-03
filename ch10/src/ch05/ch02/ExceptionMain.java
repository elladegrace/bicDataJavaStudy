package ch05.ch02;

public class ExceptionMain {
	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setBlance(10000);
		acc.deposit(10000);
		
		System.out.println(acc.getBlance());
		
		try {
			acc.withdraw(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(acc.getBlance());
		
		try {
			acc.withdraw(50000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
