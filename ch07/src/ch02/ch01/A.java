package ch02.ch01;

public class A {
	A(){ super();// 작성하지않더라도 super();가 있다 // 모든 클래스는 Object클래스를 상속받음.
		System.out.println("A생성자가 가장 먼저 실행");
	}
}
class B extends A{
	B(){ super();// 작성하지않더라도 super();가 있다
		System.out.println("A생성자 실행 후 B생성자 실행");
	}
}
class C extends B{
	C(){ super();// 작성하지않더라도 super();가 있다
		System.out.println("B생성자 실행 후 C생성자 실행");
	}
}

