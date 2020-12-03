package ch05.ch02;

public class Account {
	private long balance;

	public Account() {}

	public long getBlance() {
		return balance;
	}

	public void setBlance(long blance) {
		this.balance = balance;
	}
	
	//사용자 정의 메소드
	public void deposit(int money) {
		this.balance=this.balance;
	}
	/*
	public void withdraw(int money) {
		try {
			if(this.balance-money<0)
				throw new BalanceException("잔고부족");
			else
				this.balance=this.balance - money;
		}catch(BalanceException e) {
			System.out.println(e.getMessage());
		}
	}
	*/
	public void withdraw(int money) throws BalanceException{
			if(this.balance-money<0)
				throw new BalanceException("잔고부족");
			else
				this.balance=this.balance - money;
		}
	}
	

