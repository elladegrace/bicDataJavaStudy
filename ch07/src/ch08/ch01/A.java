package ch08.ch01;

public class A {
	void method1() {
		  System.out.println("메소드 A");
	  }
	}

	//상속
	class B extends A{
		//재정의
		void method1() {
			  System.out.println("메소드 B");
		  }
		//오버로딩
		void method2() {
			  System.out.println("메소드 B의 2");
		  }
		//오버로딩
		void method3() {
			  super.method1();//자식클래스에서 부모메소드 호출 super.부모메소드();
		  }
		//오버로딩
		void method4() {
			  this.method1();//자식클래스에서 다른 메소드 호출 this.자식메소드();
		  }

}
