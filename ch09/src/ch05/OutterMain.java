package ch05;

public class OutterMain {
	public static void main(String[] args) {
		// 바깥객체 생성
		Outter out = new Outter();
		// 바깥 참조변수.new 안쪽객체();
		Outter.Nested nested =out.new Nested();

		nested.print();
	}

}
