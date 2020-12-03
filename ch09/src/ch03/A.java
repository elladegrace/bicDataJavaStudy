package ch03;

public class A {
	// 멤버
	void method() {// instance맴버
		// 로컬 클래스
		class D{// instance맴버안의 instance클래스
			D() {}// 생성자
			int field1;//인스턴스 필드
			//static int field2;//static 맴버 불가
			void method() {System.out.println("D");}
			// static void method() {}
		}// class D
		D d= new D();
		d.field1=3;
		d.method();
	}// method영역 끝.
}
