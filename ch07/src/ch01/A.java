package ch01;

// 상속의 대상멤버는 필드와 메소드, 생성자는 상속대상에서 제외 됨.
public class A {
	// 필드
	int field1;
	//private int field1; // private를 주면 상속 불가능
	
	// 메소드
	void method1() {
	//private void method1() {// private를 주면 상속 불가능
		System.out.println("A의 메소드");
	}
}

// 상속 extends Super클래스
class B extends A{ // 여기서는 A가 수퍼클래스(부모클래스)가 된다.
	//자식(sub) 클래스에서 추가된 필드
	String field2;
	//자식(sub)클래스에서 추가된 메소드
	void method2() {
		field1=10;// 내부적으로 존재하기 때문에 접근 가능
		method1();// 내부적으로 존재하기 때문에 접근 가능
	}
}
// 상속 extends Super 클래스
class C extends A{}
