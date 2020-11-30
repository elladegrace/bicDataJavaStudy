package ch18.ch02.ch01;

//와일드카드 문자를 이용한 import 해당 패키지의 모든 클래스를 import하여 사용가능.
import java.util.Date;

import ch18.ch02.ch01.A;
import ch18.ch02.ch01.B;
import ch18.ch02.ch01.C;

public class D2 {
	A a = new A();
	B b = new B();
	//아래와 같이 사용 가능하지만 가독성이 떨어짐
	C c = new C();
}
