package ch06;

public class BitOperationShift2 {
	public static void main(String[] args) {
		byte c=20;
		byte d=-8;
		
		//비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d>>2);//상위부호 1비트 1이 채워짐
		System.out.println(d>>>2);//0이 채워짐
		System.out.printf("%x/n",(d>>2));

	}

}
