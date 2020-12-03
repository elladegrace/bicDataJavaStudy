package ch02;

public class A {
	// 바깥쪽 A클래스의 맴버로서의 B클래스, static 맴버
	static class B{// A안에서만 사용가능한 A에 종속된 B클래스
		B(){}
		int field1;
		static int field2;// static맴버는 올 수 없음
		void method1() {}
		static void method2() {}// static맴버는 올 수 없음
	} 
}
