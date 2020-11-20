package ch08;

public class FromIntToFloat {

	public static void main(String[] args) {
		//정수(int)
		int num1 = 123456780;
		int num2 = 123456780;
		
		System.out.println(num1 - num2);
		
		//정수의 값을 실수로 변환시 float타입으로 변환하면 오차가 발생할 수 있음.
		//실수(float)
		//123456780=>0b1110101101111100110100001100=>1.xxx*2^n -> wltn:127+n, 가수xxx;
		//1.23456784E8
		//double num3 = num2;
		
		float num3 = num2;
		System.out.println("num3:"+num3);
		
		num2 =(int)num3;
		System.out.println("num2:"+num2);
		
		int result = num1 - num2;
		
		System.out.println(result);

	}

}
