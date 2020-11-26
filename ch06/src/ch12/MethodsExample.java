package ch12;

public class MethodsExample {
	//매개변수 받고, 결과를 리턴하는 메소드
	double method(int x, double y) {
		return x+y;//return 값;
	}
	
	//매개변수 받고, 결과를 리턴하지 않는 메소드
	void method1(double x, double y) {
		System.out.println(x=y);
	}
	
	void method_1(double x, double y) {
		if(x>0)
			return;//void타입 메소드에서 return문은 실행 종료 의미;
		System.out.println(x+y);//return문 아래의 명령은 실행 안함.
	}
	
	//매개변수 안받고, 결과만 리턴하는 메소드
	double method2() {
		return 10.0;//return 값;
	}
	
	//매개변수 안받고, 결과도 되돌려 주지 않는 메소드
	void method3() {
		System.out.println(55);
	}
}
