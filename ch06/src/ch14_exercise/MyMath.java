package ch14_exercise;

public class MyMath {
	static int plus(int x, int y) {
		return x+y;
	}
	int minus(int x, int y) {
		return x-y;
	}
	public static void main(String[] args) {
		System.out.println(MyMath.plus(10, 20));
		//메모리 낭비
		MyMath m=new MyMath();
		m.plus(10, 20);
	}
}
