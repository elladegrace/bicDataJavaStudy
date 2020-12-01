package ch08.ch02_;

public class MainExample {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		// B클래스의 재정의 된 메소드 실행
		b.method();
		
		// A참조 변수에 B주소를 대입
		a = b;
		
		// A타입으로 변한 클래스의 메소드 실행
		a.method();
		
		//A를 참조한느 변수에 B객체를 대입
		a = new B();
		//A타입으로 변환 클래스의 메소드 실행
		//제정의된 B클래스의 메소드로 실행
		a.method();
		
		//상속 후 한번 재정의된 메소드는
		//부모타입으로 형변환을 하더라도
		//자식타입의 재정의된 내용으로 실행됨.
		A a2=new C();
		a2.method();
	}
}
