package verify.ch06;

public class Child {
	private String name;
	public Child() {
		this("홍길동");// Child(name) 호출//
		System.out.println("Child() call");// 실행4
	}
	public Child(String name) {// 실행3
		//super();// 내부적으로 숨어있음
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
