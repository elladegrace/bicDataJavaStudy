package ch18.ch02.ch01;

import java.util.Date;

import ch18.ch02.ch01.A;
import ch18.ch02.ch01.B;
import ch18.ch02.ch01.C;

public class D {
	A a = new A();
	B b = new B();
	C c = new C();
	
	// 임포트하지않고 이렇게 써도 되지만 아래와 같이 사용하면 사용은 가능하지만 가독성은 떨어짐
	// 18.ch02.ch01.C c=new ch18.ch02.ch01.C();

	void method() {
		// 예외적 상황 - 왼쪽 sql의 Date타입 오른쪽은 util의 Date타입으로 Date생성
		java.sql.Date now =new java.sql.Date(new java.util.Date().getTime());
		System.out.println(now);
	}
	
	public static void main(String[] args) {
		D d=new D();
		d.method();
	}
}
