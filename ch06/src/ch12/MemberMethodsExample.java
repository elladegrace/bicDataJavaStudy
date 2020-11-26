package ch12;

public class MemberMethodsExample {
	//배개변수 받고, 리턴타입 있는 메소드
	Member method1(String name, int age, String address) {
		return new Member(name, age, address);
	}
	
	Member method1_1(Member m) { //매개변수 받고 리턴타입
		m.name="홍길동";
		m.age=23;
		m.address="수원시";
		return m;
	}
	
	//매개변수 받고, 리턴 타입 없는 메소드
	void method2(String name, int age, String address) {
		Member m=new Member(name, age, address);
		System.out.println(m.name+","+m.age+","+m.address);
	}
	
	void method2_1(Member m) {
		System.out.println(m.name+","+m.age+","+m.address);
	}
	
	//매개변수 안받고, 리턴타입 있는 메소드
	Member method3() {
		Member m=new Member("홍길동",13,"서울시");
		return m;
	}
	
	//매개변수 안받고, 리턴타입 없는 메소드
	void method4() {
		Member m=new Member("홍길동",20,"수원시");
		System.out.println(m.name+","+m.age+m.address);
	}
	public static void main(String[] args) {
		MemberMethodsExample m1= new MemberMethodsExample();
		//매개변수 받고, 리턴 타입 있는 메소드 호출
		Member m2=m1.method1("홍길동", 20, "서울시");
		//매개변수 받고, 리턴타입 없는 메소드 호출
		m1.method2("홍길동", 20, "서울시");
		//매개변수 없고, 리턴타입 없는 메소드 호출
		Member m3=m1.method3();
		//매개변수 없고, 리턴타입 없는 메소드 호출
		m1.method4();
				
		//MethodsExample m= new MethodExample();
		//선언된 메소드 호출시는 실제값을 매개값으로 넘겨줌. result=메소드명(값1,값2);
		//double result = m.method(10,20);
		//void타입 메소드는 호출만 하고 리턴값을 받지않음 - 메소드명 (값1, 값2);
		//m.method1(10, 20);
		// 매개값 없고 결과만 리턴하는 메소드 호 result=메소드();
		//result=m.method2();
		//매개값 없고, 결과도 리턴하지 않는 메소드 호출 메소드();
		//m.method3();
	}
}
