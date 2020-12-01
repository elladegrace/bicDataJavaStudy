package ch08.ch02_;

public class A {
	void method() {
		System.out.println("메소드 A");
	}
}

// 재정의 된 이후에는 재정의 된 내용으로 실행
class B extends A{
	void method() {
		System.out.println("메소드 B");
	}
}

class C extends A{
	void method() {
		System.out.println("메소드 C");
	}
}