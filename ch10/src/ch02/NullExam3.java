package ch02;

public class NullExam3 {
	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.length());
			System.out.println(args[1]);
			Animal animal = new Dog();
			Cat cat=(Cat)animal;
		// 다중 catch절
		// catch(NullPointerException e1) {
		//	System.out.println("예외발생");
		}catch(NullPointerException e1){
			System.out.println("예외발생");
		}catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("예외발생");
		// 상위 예외일수록 아래로, 하위 예외 객체 일수록 위로 배치
		}catch(ClassCastException e3) {
			System.out.println("예외발생");
		}
	}
}

