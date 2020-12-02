package ch09.ch04;

public class SalaryMan extends Employee {
	private int annualSal;// 연봉 필드
	// 생성자
	public SalaryMan(String[] args, int annualSal) {
		super(args);
		this.annualSal = annualSal;
	}
	// 메소드 재정의
	@Override
	int computerPay() {
		sal=annualSal/12;
		return sal;
	}

}
