package ch04;

public class PMainExample {
	public static void main(String[] args) {
		Person gildong=new Person();
		
		gildong.setName("홍길동");
		gildong.setAge(-20);
		
		System.out.println(gildong.toString());
	}
}
