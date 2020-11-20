package ch01;

public class MainExample {
	public static void main(String[] args) {
		//변수선언
		// 타입 변수명 = new 타입명();
		MyClass instance=new MyClass();
		//생성된 객체(instance)를 참조하는 변수가 가리키는 객체의 함수를 실행;
		 instance.printMyMessage();
		 
		 MyClass instance2=new MyClass();
		 instance2.printMyMessage();
	}
}
