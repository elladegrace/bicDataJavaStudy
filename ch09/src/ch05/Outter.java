package ch05;

public class Outter {
	String field="Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	class Nested{
		String field="Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		// 메소드
		void print() {
			System.out.println(this.field);// 안쪽맴버 this.맴버
				this.method();// 안쪽맴버 this.맴버
				
				// 바깥쪽 맴버 참조 : 바깥쪽. this.맴버
				System.out.println(Outter.this.field);// 
				Outter.this.method();//
		}
	}// Nested
	

	
}
