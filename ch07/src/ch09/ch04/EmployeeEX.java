package ch09.ch04;

// 보너스 계산 프로그램
public class EmployeeEX {
	public static void main(String[] args) {
		Employee[] emp = new Employee[10];
		emp[0]=new SalaryMan("길동",5000000);
		emp[1]= new SalaryMan("일지매",200000);
		emp[1]= new SalaryMan("꺽정",8000000);
		emp[1]= new HourMan("순실",15,9000);
		emp[1]= new HourMan("관수",9000);
		emp[1]= new HourMan("순신",9400);
		
		for(int i=0;i<emp.length;i++) {
			emp[i].computerPay();
			emp[i].computerIncentive()
			emp[i].print();
		}
		
	}

}
