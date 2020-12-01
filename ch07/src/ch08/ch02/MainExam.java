package ch08.ch02;

public class MainExam {
	public static void main(String[] args) {
		A a=new A();
		a = new B();
		a = new C();
		a = new D();
		a = new E();
		
		B b = new B();
		b=new D();
		
		C c = new C();
		c = new E();
		
		//교차는 안된
		//b=new E();
		//c=new D();
		

	}

}
